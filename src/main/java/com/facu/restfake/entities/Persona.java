package com.facu.restfake.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona extends Base{

    private String nombre;

    private String apellido;

    private int dni;

    @OneToMany (cascade = CascadeType.MERGE, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn (name = "persona_id")
    private List<Libro> libros = new ArrayList<>();

    @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn (name = "domicilio_id")
    private Domicilio domicilio;

    public void addLibro (Libro libro){
        libros.add(libro);
    }
}
