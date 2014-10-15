package com.american.doors.model;

import com.american.doors.model.Empleados;
import com.american.doors.model.Fases;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-10-14T23:35:24")
@StaticMetamodel(FasesXEmpleados.class)
public class FasesXEmpleados_ { 

    public static volatile SingularAttribute<FasesXEmpleados, Empleados> idEmpleado;
    public static volatile SingularAttribute<FasesXEmpleados, Date> fechaHoraInicioReproceso;
    public static volatile SingularAttribute<FasesXEmpleados, Fases> idFase;
    public static volatile SingularAttribute<FasesXEmpleados, Date> fechaHoraInicio;
    public static volatile SingularAttribute<FasesXEmpleados, Integer> idFasesXEmpleados;
    public static volatile SingularAttribute<FasesXEmpleados, Date> fechaHoraFin;
    public static volatile SingularAttribute<FasesXEmpleados, Boolean> faseFinalizada;

}