/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristianaguilar.sesionbeans;

import com.cristianaguilar.entities.Notaorden;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class NotaordenFacade extends AbstractFacade<Notaorden> implements NotaordenFacadeLocal {

    @PersistenceContext(unitName = "WebRestaurante_IN5BM201539501PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NotaordenFacade() {
        super(Notaorden.class);
    }
    
}
