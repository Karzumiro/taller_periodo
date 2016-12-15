/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estu.repository;

import com.estu.dominio.Estudiante;
import com.estu.dominio.Pensum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carot
 */
@RestController
public class Pensumcontroller {
 @Autowired
    private Pensumrepository pensumrepository;
    
    @RequestMapping (value = "/pensum/{pensum_id}/grupos/{grupo_id}/estudiante", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPensum(@PathVariable int pensum_id , @PathVariable int grupo_id){
         return new ResponseEntity<>(pensumrepository.getestudiantesbyPensum(pensum_id, grupo_id),HttpStatus.OK); 
    }
    }
	
	
