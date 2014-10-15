/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.american.doors.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hugo-aguilar
 */
@Entity
@Table(name = "fases")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fases.findAll", query = "SELECT f FROM Fases f"),
    @NamedQuery(name = "Fases.findByIdFases", query = "SELECT f FROM Fases f WHERE f.idFases = :idFases"),
    @NamedQuery(name = "Fases.findByNombreFase", query = "SELECT f FROM Fases f WHERE f.nombreFase = :nombreFase"),
    @NamedQuery(name = "Fases.findByTiempoPromedioFase", query = "SELECT f FROM Fases f WHERE f.tiempoPromedioFase = :tiempoPromedioFase"),
    @NamedQuery(name = "Fases.findByReproceso", query = "SELECT f FROM Fases f WHERE f.reproceso = :reproceso"),
    @NamedQuery(name = "Fases.findByCodReprocesoFase", query = "SELECT f FROM Fases f WHERE f.codReprocesoFase = :codReprocesoFase"),
    @NamedQuery(name = "Fases.findByCodInicioFase", query = "SELECT f FROM Fases f WHERE f.codInicioFase = :codInicioFase"),
    @NamedQuery(name = "Fases.findByCodFinFase", query = "SELECT f FROM Fases f WHERE f.codFinFase = :codFinFase")})
public class Fases implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fases")
    private Integer idFases;
    @Column(name = "nombre_fase")
    private String nombreFase;
    @Column(name = "tiempo_promedio_fase")
    @Temporal(TemporalType.TIME)
    private Date tiempoPromedioFase;
    @Column(name = "reproceso")
    private Boolean reproceso;
    @Column(name = "cod_reproceso_fase")
    private String codReprocesoFase;
    @Column(name = "cod_inicio_fase")
    private String codInicioFase;
    @Column(name = "cod_fin_fase")
    private String codFinFase;
    @OneToMany(mappedBy = "idFase")
    private List<FasesXEmpleados> fasesXEmpleadosList;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne
    private Productos idProducto;

    public Fases() {
    }

    public Fases(Integer idFases) {
        this.idFases = idFases;
    }

    public Integer getIdFases() {
        return idFases;
    }

    public void setIdFases(Integer idFases) {
        this.idFases = idFases;
    }

    public String getNombreFase() {
        return nombreFase;
    }

    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }

    public Date getTiempoPromedioFase() {
        return tiempoPromedioFase;
    }

    public void setTiempoPromedioFase(Date tiempoPromedioFase) {
        this.tiempoPromedioFase = tiempoPromedioFase;
    }

    public Boolean getReproceso() {
        return reproceso;
    }

    public void setReproceso(Boolean reproceso) {
        this.reproceso = reproceso;
    }

    public String getCodReprocesoFase() {
        return codReprocesoFase;
    }

    public void setCodReprocesoFase(String codReprocesoFase) {
        this.codReprocesoFase = codReprocesoFase;
    }

    public String getCodInicioFase() {
        return codInicioFase;
    }

    public void setCodInicioFase(String codInicioFase) {
        this.codInicioFase = codInicioFase;
    }

    public String getCodFinFase() {
        return codFinFase;
    }

    public void setCodFinFase(String codFinFase) {
        this.codFinFase = codFinFase;
    }

    @XmlTransient
    public List<FasesXEmpleados> getFasesXEmpleadosList() {
        return fasesXEmpleadosList;
    }

    public void setFasesXEmpleadosList(List<FasesXEmpleados> fasesXEmpleadosList) {
        this.fasesXEmpleadosList = fasesXEmpleadosList;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFases != null ? idFases.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fases)) {
            return false;
        }
        Fases other = (Fases) object;
        if ((this.idFases == null && other.idFases != null) || (this.idFases != null && !this.idFases.equals(other.idFases))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.american.doors.model.Fases[ idFases=" + idFases + " ]";
    }
    
}
