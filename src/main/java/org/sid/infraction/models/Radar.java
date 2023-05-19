package org.sid.infraction.models;

import lombok.Data;

@Data

public class Radar {
    private Long id;
    private double vitesseMax ;
    private double longitude;
    private double latitude;
}
