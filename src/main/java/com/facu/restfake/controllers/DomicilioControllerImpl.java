package com.facu.restfake.controllers;

import com.facu.restfake.entities.Domicilio;
import com.facu.restfake.services.DomicilioServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "Parcial1_Maya.com/domicilios")
public class DomicilioControllerImpl extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {

    @GetMapping("/searchNativoCalle")
    public ResponseEntity<?> searchNativoCalle(@RequestParam String calle, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNativoCalle(calle, pageable));
        }catch (Exception e){
            String strErr = e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":"+strErr+"}");
        }
    }
}
