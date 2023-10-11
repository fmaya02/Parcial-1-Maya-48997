package com.facu.restfake.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro extends Base{

    private String titulo;

    private int fecha;

    private String genero;

    private int paginas;

    @ManyToMany (cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable (name = "LibroAutor",
            joinColumns = @JoinColumn (name = "libro_id"),
            inverseJoinColumns = @JoinColumn (name = "autor_id"))
    private List<Autor> autores = new ArrayList<>();
}
