package com.facu.restfake.services;

import com.facu.restfake.entities.Autor;
import jakarta.persistence.Entity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface AutorService extends BaseService<Autor,Long>{

    Page<Autor> searchJPQLApellido(String apellido, Pageable pageable) throws Exception;
}
