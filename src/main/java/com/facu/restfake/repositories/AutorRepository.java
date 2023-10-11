package com.facu.restfake.repositories;

import com.facu.restfake.entities.Autor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long>{

    //Buscar autor por apellido, usando JPQL
    @Query(value = "SELECT a FROM Autor a WHERE a.apellido LIKE %:apellido%")
    Page<Autor> searchJPQLApellido(@Param("apellido") String apellido, Pageable pageable);
}
