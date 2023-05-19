package org.sid.infraction.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private int  numRadar;
    @Transient
    private String vehicleMatricule;
    @Transient
    private double vehicleSpeed;
    private double radarMaxSpeed;
    private double amount;
}
