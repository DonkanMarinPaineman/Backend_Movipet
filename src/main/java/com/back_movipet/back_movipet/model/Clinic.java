package com.back_movipet.back_movipet.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clinics")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Clinic {
    @Id
    private String id;

    private String clinic_name;
    private String clinic_address;
    private String clinic_phone;
    private String clinic_email;
    private Double latitude;
    private Double longitude;
    private String address;



}
