package com.facu.restfake.services;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.entities.Persona;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl (BaseRepository<Persona,Long> baseRepository, PersonaRepository personaRepository){
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public Page<Persona> findByNombreContainingOrApellidoContaining(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> searchJPQL(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Persona> personas = personaRepository.searchJPQL(filtro, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> searchNativo(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Persona> personas = personaRepository.searchNativo(filtro, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
