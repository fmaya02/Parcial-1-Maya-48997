package com.facu.restfake.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Autor extends Base{
    private String nombre;

    private String apellido;

    private String biografia;
}
