package com.cristianaguilar.entities;

import com.cristianaguilar.entities.Cocineros;
import com.cristianaguilar.entities.Facturas;
import com.cristianaguilar.entities.Plato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-09-18T07:14:18")
@StaticMetamodel(Detallefacturas.class)
public class Detallefacturas_ { 

    public static volatile SingularAttribute<Detallefacturas, Double> precio;
    public static volatile SingularAttribute<Detallefacturas, Integer> iddetalleFactura;
    public static volatile SingularAttribute<Detallefacturas, Double> totalVenta;
    public static volatile SingularAttribute<Detallefacturas, Plato> idplato;
    public static volatile SingularAttribute<Detallefacturas, Integer> cantidad;
    public static volatile SingularAttribute<Detallefacturas, Cocineros> idcocinero;
    public static volatile SingularAttribute<Detallefacturas, Facturas> idfactura;

}