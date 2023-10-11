package com.facu.restfake.controllers;

import com.facu.restfake.entities.Libro;
import com.facu.restfake.entities.Persona;
import com.facu.restfake.services.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "Parcial1_Maya.com/personas")
public class PersonaControllerImpl extends BaseControllerImpl<Persona, PersonaServiceImpl> {

    @GetMapping("/findByNombreContainingOrApellidoContainingPaged")
    public ResponseEntity<?> findByNombreContainingOrApellidoContaining(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findByNombreContainingOrApellidoContaining(filtro, pageable));
        }catch (Exception e){
            String strErr = e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":"+strErr+"}");
        }
    }

    @GetMapping("/searchJPQLPaged")
    public ResponseEntity<?> searchJPQL(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchJPQL(filtro, pageable));
        }catch (Exception e){
            String strErr = e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":"+strErr+"}");
        }
    }

    @GetMapping("/searchNativoPaged")
    public ResponseEntity<?> searchNativo(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNativo(filtro, pageable));
        }catch (Exception e){
            String strErr = e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":"+strErr+"}");
        }
    }
}
