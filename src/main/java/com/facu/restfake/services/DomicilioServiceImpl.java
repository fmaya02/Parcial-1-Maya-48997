package com.facu.restfake.services;

import com.facu.restfake.entities.Domicilio;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl (BaseRepository<Domicilio,Long> baseRepository, DomicilioRepository domicilioRepository){
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }

    @Override
    public Page<Domicilio> searchNativoCalle(String calle, Pageable pageable) throws Exception {
        try{
            Page<Domicilio> domicilios = domicilioRepository.searchNativoCalle(calle, pageable);
            return domicilios;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
