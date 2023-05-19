package org.sid.infraction.models;

import jakarta.persistence.Id;
import lombok.Data;

@Data

public class Owner {
    @Id
    private String id;
    private String name;
    private Long birthDate;
    private String email;

}
