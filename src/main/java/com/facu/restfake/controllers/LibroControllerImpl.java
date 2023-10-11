package com.facu.restfake.controllers;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "Parcial1_Maya.com/libros")
public class LibroControllerImpl extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
