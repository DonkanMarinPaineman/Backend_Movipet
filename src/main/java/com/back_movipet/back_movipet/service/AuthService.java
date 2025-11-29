package com.back_movipet.back_movipet.service;

import com.back_movipet.back_movipet.dto.LoginRequest;
import com.back_movipet.back_movipet.dto.RegisterRequest;
import com.back_movipet.back_movipet.dto.UserResponse;
import com.back_movipet.back_movipet.model.User;
import com.back_movipet.back_movipet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public UserResponse register(RegisterRequest request) {
        // 1) validar que el correo no esté repetido
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("El correo ya está registrado");
        }

        // 2) crear usuario
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword()) // para demo, sin encriptar
                .build();

        userRepository.save(user);
        return UserResponse.from(user);
    }

    public UserResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new IllegalArgumentException("Contraseña incorrecta");
        }

        return UserResponse.from(user);
    }
}
