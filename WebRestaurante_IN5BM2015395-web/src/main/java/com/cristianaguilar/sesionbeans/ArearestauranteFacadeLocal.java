/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristianaguilar.sesionbeans;

import com.cristianaguilar.entities.Arearestaurante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface ArearestauranteFacadeLocal {

    void create(Arearestaurante arearestaurante);

    void edit(Arearestaurante arearestaurante);

    void remove(Arearestaurante arearestaurante);

    Arearestaurante find(Object id);

    List<Arearestaurante> findAll();

    List<Arearestaurante> findRange(int[] range);

    int count();
    
}
