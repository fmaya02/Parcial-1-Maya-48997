package com.facu.restfake.services;

import com.facu.restfake.entities.Autor;
import com.facu.restfake.entities.Domicilio;
import com.facu.restfake.repositories.AutorRepository;
import com.facu.restfake.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository, AutorRepository autorRepository){
        super(baseRepository);
        this.autorRepository = autorRepository;
    }

    @Override
    public Page<Autor> searchJPQLApellido(String apellido, Pageable pageable) throws Exception {
        try{
            Page<Autor> autores = autorRepository.searchJPQLApellido(apellido, pageable);
            return autores;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
