package com.facu.restfake.services;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl (BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository){
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
