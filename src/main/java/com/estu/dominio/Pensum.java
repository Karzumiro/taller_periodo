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

/**
 *
 * @author carot
 */
 @Entity(name = "pensum")
public class Pensum {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pensum_id;
    private int materia_id;
    private int grupo_id;
    
  @ManyToOne
    @JoinColumn(name="estudiante_id")
    private Estudiante estudiante;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="periodoid")
    private Periodoo periodo;
    
    
    public Pensum() {
		super();
	}

    public Pensum(int pensum_id, int materia_id, int grupo_id, Estudiante estudiante, Periodoo periodo) {
        this.pensum_id = pensum_id;
        this.materia_id = materia_id;
        this.grupo_id = grupo_id;
        this.estudiante = estudiante;
        this.periodo = periodo;
    }


    public int getPensum_id() {
        return pensum_id;
    }

    public void setPensum_id(int pensum_id) {
        this.pensum_id = pensum_id;
    }

    public int getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(int materia_id) {
        this.materia_id = materia_id;
    }

    public int getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(int grupo_id) {
        this.grupo_id = grupo_id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Periodoo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodoo periodo) {
        this.periodo = periodo;
    }

   
 }
