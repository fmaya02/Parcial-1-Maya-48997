package com.facu.restfake.controllers;

import com.facu.restfake.entities.Localidad;
import com.facu.restfake.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "Parcial1_Maya.com/localidades")
public class LocalidadControllerImpl extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
