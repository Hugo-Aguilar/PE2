/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.american.doors.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hugo-aguilar
 */
@Entity
@Table(name = "fases_x_empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FasesXEmpleados.findAll", query = "SELECT f FROM FasesXEmpleados f"),
    @NamedQuery(name = "FasesXEmpleados.findByIdFasesXEmpleados", query = "SELECT f FROM FasesXEmpleados f WHERE f.idFasesXEmpleados = :idFasesXEmpleados"),
    @NamedQuery(name = "FasesXEmpleados.findByFechaHoraInicio", query = "SELECT f FROM FasesXEmpleados f WHERE f.fechaHoraInicio = :fechaHoraInicio"),
    @NamedQuery(name = "FasesXEmpleados.findByFechaHoraInicioReproceso", query = "SELECT f FROM FasesXEmpleados f WHERE f.fechaHoraInicioReproceso = :fechaHoraInicioReproceso"),
    @NamedQuery(name = "FasesXEmpleados.findByFechaHoraFin", query = "SELECT f FROM FasesXEmpleados f WHERE f.fechaHoraFin = :fechaHoraFin"),
    @NamedQuery(name = "FasesXEmpleados.findByFaseFinalizada", query = "SELECT f FROM FasesXEmpleados f WHERE f.faseFinalizada = :faseFinalizada")})
public class FasesXEmpleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fases_x_empleados")
    private Integer idFasesXEmpleados;
    @Column(name = "fecha_hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraInicio;
    @Column(name = "fecha_hora_inicio_reproceso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraInicioReproceso;
    @Column(name = "fecha_hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraFin;
    @Column(name = "fase_finalizada")
    private Boolean faseFinalizada;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne
    private Empleados idEmpleado;
    @JoinColumn(name = "id_fase", referencedColumnName = "id_fases")
    @ManyToOne
    private Fases idFase;

    public FasesXEmpleados() {
    }

    public FasesXEmpleados(Integer idFasesXEmpleados) {
        this.idFasesXEmpleados = idFasesXEmpleados;
    }

    public Integer getIdFasesXEmpleados() {
        return idFasesXEmpleados;
    }

    public void setIdFasesXEmpleados(Integer idFasesXEmpleados) {
        this.idFasesXEmpleados = idFasesXEmpleados;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Date getFechaHoraInicioReproceso() {
        return fechaHoraInicioReproceso;
    }

    public void setFechaHoraInicioReproceso(Date fechaHoraInicioReproceso) {
        this.fechaHoraInicioReproceso = fechaHoraInicioReproceso;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Boolean getFaseFinalizada() {
        return faseFinalizada;
    }

    public void setFaseFinalizada(Boolean faseFinalizada) {
        this.faseFinalizada = faseFinalizada;
    }

    public Empleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Fases getIdFase() {
        return idFase;
    }

    public void setIdFase(Fases idFase) {
        this.idFase = idFase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFasesXEmpleados != null ? idFasesXEmpleados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FasesXEmpleados)) {
            return false;
        }
        FasesXEmpleados other = (FasesXEmpleados) object;
        if ((this.idFasesXEmpleados == null && other.idFasesXEmpleados != null) || (this.idFasesXEmpleados != null && !this.idFasesXEmpleados.equals(other.idFasesXEmpleados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.american.doors.model.FasesXEmpleados[ idFasesXEmpleados=" + idFasesXEmpleados + " ]";
    }
    
}
