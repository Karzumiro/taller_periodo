/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estu.repository;

import com.estu.dominio.Pensum;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author carot
 */
public interface Pensumrepository extends CrudRepository <Pensum ,Integer> {
     

    @Query(value = "select new com.estu.dominio.Pensum(pe.pensum_id, pe.materia_id,  pe.grupo_id, est) from pensum pe inner join pe.estudiante est  "
			+ "where pe.pensum_id=?1 and pe.grupo_id=?2", nativeQuery=false)
	public List<Pensum> getestudiantesbyPensum(int pensum_id, int grupo_id);
	
	
}


