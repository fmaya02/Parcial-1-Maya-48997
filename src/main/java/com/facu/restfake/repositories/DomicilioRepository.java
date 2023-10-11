package com.facu.restfake.repositories;

import com.facu.restfake.entities.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {

    //Buscar domicilio por calle, usando Native Query
    @Query(value = "SELECT * FROM domicilio WHERE domicilio.calle LIKE %:calle%",
            countQuery = "SELECT count(*) FROM domicilio",
            nativeQuery = true)
    Page<Domicilio> searchNativoCalle(@Param("calle") String calle, Pageable pageable);
}
