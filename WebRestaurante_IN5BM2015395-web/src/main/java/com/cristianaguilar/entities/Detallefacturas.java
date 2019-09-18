/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristianaguilar.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "detallefacturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefacturas.findAll", query = "SELECT d FROM Detallefacturas d")
    , @NamedQuery(name = "Detallefacturas.findByIddetalleFactura", query = "SELECT d FROM Detallefacturas d WHERE d.iddetalleFactura = :iddetalleFactura")
    , @NamedQuery(name = "Detallefacturas.findByPrecio", query = "SELECT d FROM Detallefacturas d WHERE d.precio = :precio")
    , @NamedQuery(name = "Detallefacturas.findByCantidad", query = "SELECT d FROM Detallefacturas d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallefacturas.findByTotalVenta", query = "SELECT d FROM Detallefacturas d WHERE d.totalVenta = :totalVenta")})
public class Detallefacturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalleFactura")
    private Integer iddetalleFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalVenta")
    private double totalVenta;
    @JoinColumn(name = "idfactura", referencedColumnName = "idfactura")
    @ManyToOne(optional = false)
    private Facturas idfactura;
    @JoinColumn(name = "idcocinero", referencedColumnName = "idcocinero")
    @ManyToOne(optional = false)
    private Cocineros idcocinero;
    @JoinColumn(name = "idplato", referencedColumnName = "idplato")
    @ManyToOne(optional = false)
    private Plato idplato;

    public Detallefacturas() {
    }

    public Detallefacturas(Integer iddetalleFactura) {
        this.iddetalleFactura = iddetalleFactura;
    }

    public Detallefacturas(Integer iddetalleFactura, double precio, int cantidad, double totalVenta) {
        this.iddetalleFactura = iddetalleFactura;
        this.precio = precio;
        this.cantidad = cantidad;
        this.totalVenta = totalVenta;
    }

    public Integer getIddetalleFactura() {
        return iddetalleFactura;
    }

    public void setIddetalleFactura(Integer iddetalleFactura) {
        this.iddetalleFactura = iddetalleFactura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Facturas getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Facturas idfactura) {
        this.idfactura = idfactura;
    }

    public Cocineros getIdcocinero() {
        return idcocinero;
    }

    public void setIdcocinero(Cocineros idcocinero) {
        this.idcocinero = idcocinero;
    }

    public Plato getIdplato() {
        return idplato;
    }

    public void setIdplato(Plato idplato) {
        this.idplato = idplato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalleFactura != null ? iddetalleFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefacturas)) {
            return false;
        }
        Detallefacturas other = (Detallefacturas) object;
        if ((this.iddetalleFactura == null && other.iddetalleFactura != null) || (this.iddetalleFactura != null && !this.iddetalleFactura.equals(other.iddetalleFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cristianaguilar.jpa01.Detallefacturas[ iddetalleFactura=" + iddetalleFactura + " ]";
    }
    
}
