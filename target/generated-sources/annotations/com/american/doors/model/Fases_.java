package com.american.doors.model;

import com.american.doors.model.FasesXEmpleados;
import com.american.doors.model.Productos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-14T23:35:24")
@StaticMetamodel(Fases.class)
public class Fases_ { 

    public static volatile SingularAttribute<Fases, Integer> idFases;
    public static volatile SingularAttribute<Fases, String> nombreFase;
    public static volatile SingularAttribute<Fases, Date> tiempoPromedioFase;
    public static volatile ListAttribute<Fases, FasesXEmpleados> fasesXEmpleadosList;
    public static volatile SingularAttribute<Fases, Boolean> reproceso;
    public static volatile SingularAttribute<Fases, String> codInicioFase;
    public static volatile SingularAttribute<Fases, String> codFinFase;
    public static volatile SingularAttribute<Fases, Productos> idProducto;
    public static volatile SingularAttribute<Fases, String> codReprocesoFase;

}