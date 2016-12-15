/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estu.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *.0
 *  .
 * @author carot
 */

@Entity (name="estudiante")
public class Estudiante {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    
    private String descripcion;
    @JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pensum_id")
	private Set<Pensum> pensum;

    public Estudiante(int idEstudiante, String descripcion, Set<Pensum> pensum) {
        this.idEstudiante = idEstudiante;
        this.descripcion = descripcion;
        this.pensum = pensum;
    }
    
    
    
    
    public Estudiante() {
        super();
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Pensum> getPensum() {
        return pensum;
    }

    public void setPensum(Set<Pensum> pensum) {
        this.pensum = pensum;
    }
   
}