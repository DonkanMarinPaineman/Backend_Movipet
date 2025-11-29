package com.back_movipet.back_movipet.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
