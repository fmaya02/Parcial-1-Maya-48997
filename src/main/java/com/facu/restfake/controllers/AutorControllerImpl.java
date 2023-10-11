package com.facu.restfake.controllers;

import com.facu.restfake.entities.Autor;
import com.facu.restfake.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin ("*")
@RequestMapping (path = "MayaFakeApi.com/autores")
public class AutorControllerImpl extends  BaseControllerImpl<Autor, AutorServiceImpl> {
}
