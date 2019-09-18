/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristianaguilar.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "arearestaurante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arearestaurante.findAll", query = "SELECT a FROM Arearestaurante a")
    , @NamedQuery(name = "Arearestaurante.findByIdarea", query = "SELECT a FROM Arearestaurante a WHERE a.idarea = :idarea")
    , @NamedQuery(name = "Arearestaurante.findByDescripcion", query = "SELECT a FROM Arearestaurante a WHERE a.descripcion = :descripcion")})
public class Arearestaurante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idarea")
    private Integer idarea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idarea")
    private List<Mesas> mesasList;

    public Arearestaurante() {
    }

    public Arearestaurante(Integer idarea) {
        this.idarea = idarea;
    }

    public Arearestaurante(Integer idarea, String descripcion) {
        this.idarea = idarea;
        this.descripcion = descripcion;
    }

    public Integer getIdarea() {
        return idarea;
    }

    public void setIdarea(Integer idarea) {
        this.idarea = idarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Mesas> getMesasList() {
        return mesasList;
    }

    public void setMesasList(List<Mesas> mesasList) {
        this.mesasList = mesasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarea != null ? idarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arearestaurante)) {
            return false;
        }
        Arearestaurante other = (Arearestaurante) object;
        if ((this.idarea == null && other.idarea != null) || (this.idarea != null && !this.idarea.equals(other.idarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cristianaguilar.jpa01.Arearestaurante[ idarea=" + idarea + " ]";
    }
    
}
