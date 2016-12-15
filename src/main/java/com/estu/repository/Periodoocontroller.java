/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estu.repository;


import com.estu.dominio.Periodoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Periodoocontroller {
    @Autowired
    private Periodoorepository periodorepository;
    
    @RequestMapping (value= "/periodo",method = RequestMethod.POST)
    public ResponseEntity<?> crearPeriodo(@RequestBody Periodoo  periodo){
        periodorepository.save(periodo);
        return new ResponseEntity<>(periodo,HttpStatus.CREATED);
    }
    
    @RequestMapping (value= "/periodo",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPeriodoo(){
        Iterable<Periodoo> periodo= periodorepository.findAll();
        return new ResponseEntity<>(periodo,HttpStatus.OK);
    }
    
    @RequestMapping (value = "/periodo/{periodo_id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPeriodoo(@PathVariable int periodo_id){
       Periodoo periodo= periodorepository.findOne(periodo_id);
        return new ResponseEntity<>(periodo,HttpStatus.OK); //encuesta me obtiene el id
    }
    
    @RequestMapping (value = "/periodo/{periodo_id}",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarPeriodoo(@RequestBody Periodoo periodo,@PathVariable int periodo_id){
       periodorepository.save(periodo);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping (value = "/periodo/{periodo_id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarPeriodo(@PathVariable int periodo_id){
       periodorepository.delete(periodo_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


