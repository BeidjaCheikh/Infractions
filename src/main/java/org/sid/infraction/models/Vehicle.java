package org.sid.infraction.models;

import lombok.Data;

@Data

public class Vehicle {
    private Long id;
    private String matricule;
    private String marque;
    private int puissanceFiscale;
    private String model;
}
