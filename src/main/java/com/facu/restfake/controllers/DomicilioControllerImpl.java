package com.facu.restfake.controllers;

import com.facu.restfake.entities.Domicilio;
import com.facu.restfake.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "MayaFakeApi.com/domicilios")
public class DomicilioControllerImpl extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
