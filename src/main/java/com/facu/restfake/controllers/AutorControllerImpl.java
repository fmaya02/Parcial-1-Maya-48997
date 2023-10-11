package com.facu.restfake.controllers;

import com.facu.restfake.entities.Autor;
import com.facu.restfake.services.AutorServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin ("*")
@RequestMapping (path = "Parcial1_Maya.com/autores")
public class AutorControllerImpl extends  BaseControllerImpl<Autor, AutorServiceImpl> {

    @GetMapping("/searchJPQLApellido")
    public ResponseEntity<?> searchJPQLApellido(@RequestParam String apellido, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchJPQLApellido(apellido, pageable));
        }catch (Exception e){
            String strErr = e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":"+strErr+"}");
        }
    }
}
