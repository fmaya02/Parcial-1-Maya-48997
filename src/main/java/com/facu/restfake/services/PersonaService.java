package com.facu.restfake.services;

import com.facu.restfake.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long> {

    Page<Persona> findByNombreContainingOrApellidoContaining(String filtro, Pageable pageable) throws Exception;

    Page<Persona> searchJPQL(String filtro, Pageable pageable) throws Exception;

    Page<Persona> searchNativo(String filtro, Pageable pageable) throws Exception;
}
