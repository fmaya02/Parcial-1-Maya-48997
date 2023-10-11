package com.facu.restfake.services;

import com.facu.restfake.entities.Localidad;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl (BaseRepository<Localidad,Long> baseRepository, LocalidadRepository localidadRepository){
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
