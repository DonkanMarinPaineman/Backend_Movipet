package com.back_movipet.back_movipet.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String name;
    private String email;

    // OJO: solo para demo / proyecto. En producción esto debe ir encriptado.
    private String password;
}