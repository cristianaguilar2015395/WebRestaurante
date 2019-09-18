package com.cristianaguilar.entities;

import com.cristianaguilar.entities.Clientes;
import com.cristianaguilar.entities.Detallefacturas;
import com.cristianaguilar.entities.Mesas;
import com.cristianaguilar.entities.Meseros;
import com.cristianaguilar.entities.Notaorden;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T07:14:18")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, Mesas> idmesa;
    public static volatile ListAttribute<Facturas, Detallefacturas> detallefacturasList;
    public static volatile SingularAttribute<Facturas, String> fechaFactura;
    public static volatile SingularAttribute<Facturas, Notaorden> idorden;
    public static volatile SingularAttribute<Facturas, Meseros> idmesero;
    public static volatile SingularAttribute<Facturas, Clientes> idcliente;
    public static volatile SingularAttribute<Facturas, Integer> idfactura;

}