package com.back_movipet.back_movipet.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pets")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pet {

    @Id
    private String id;

    @NotBlank(message = "El nombre de la mascota es obligatorio")
    private String name;

    @NotBlank(message = "El tipo de mascota es obligatorio")
    private String type;        // perro, gato, etc

    private String breed;

    @PositiveOrZero(message = "La edad no puede ser negativa")
    private Integer age;

    @PositiveOrZero(message = "El peso no puede ser negativo")
    private Double weight;

    private Long createdAt;
}
