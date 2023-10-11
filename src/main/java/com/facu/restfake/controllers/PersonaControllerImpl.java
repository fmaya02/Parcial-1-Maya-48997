package com.facu.restfake.controllers;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.entities.Persona;
import com.facu.restfake.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "MayaFakeApi.com/personas")
public class PersonaControllerImpl extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}
