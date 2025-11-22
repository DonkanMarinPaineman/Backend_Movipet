package com.back_movipet.back_movipet.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trips")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Trip {

    @Id
    private String id;

    @NotBlank(message = "La dirección de origen es obligatoria")
    private String fromAddress;

    @NotBlank(message = "La dirección de destino es obligatoria")
    private String toAddress;

    private Double fromLat;
    private Double fromLon;
    private Double toLat;
    private Double toLon;

    @NotBlank(message = "El nombre del conductor es obligatorio")
    private String driverName;

    @NotBlank(message = "El vehículo del conductor es obligatorio")
    private String driverCar;

    @Positive(message = "La distancia debe ser mayor que 0")
    private Double distance;    // km

    @Positive(message = "La duración debe ser mayor que 0")
    private Integer duration;   // minutos

    @PositiveOrZero(message = "El costo no puede ser negativo")
    private Double cost;

    private Integer rating;     // opcional
    private String comment;     // opcional

    private Long petId;
    private String veterinaryName;
    private Long timestamp;
}
