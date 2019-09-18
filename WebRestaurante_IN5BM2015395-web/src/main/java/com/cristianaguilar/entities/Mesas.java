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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "mesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesas.findAll", query = "SELECT m FROM Mesas m")
    , @NamedQuery(name = "Mesas.findByIdmesa", query = "SELECT m FROM Mesas m WHERE m.idmesa = :idmesa")
    , @NamedQuery(name = "Mesas.findByNumeroPersonas", query = "SELECT m FROM Mesas m WHERE m.numeroPersonas = :numeroPersonas")})
public class Mesas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmesa")
    private Integer idmesa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroPersonas")
    private int numeroPersonas;
    @JoinColumn(name = "idarea", referencedColumnName = "idarea")
    @ManyToOne(optional = false)
    private Arearestaurante idarea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmesa")
    private List<Facturas> facturasList;

    public Mesas() {
    }

    public Mesas(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public Mesas(Integer idmesa, int numeroPersonas) {
        this.idmesa = idmesa;
        this.numeroPersonas = numeroPersonas;
    }

    public Integer getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Arearestaurante getIdarea() {
        return idarea;
    }

    public void setIdarea(Arearestaurante idarea) {
        this.idarea = idarea;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesa != null ? idmesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesas)) {
            return false;
        }
        Mesas other = (Mesas) object;
        if ((this.idmesa == null && other.idmesa != null) || (this.idmesa != null && !this.idmesa.equals(other.idmesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cristianaguilar.jpa01.Mesas[ idmesa=" + idmesa + " ]";
    }
    
}
