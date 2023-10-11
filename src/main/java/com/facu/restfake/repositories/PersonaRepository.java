package com.facu.restfake.repositories;

import com.facu.restfake.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Metodos de Query
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    boolean existsByDni(int dni);

    //JPQL con parametros nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> searchJPQL(@Param("filtro") String filtro, Pageable pageable);

    //Query Nativa de SQL
    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true)
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
