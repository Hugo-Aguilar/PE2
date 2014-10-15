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
@Table(name = "proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p"),
    @NamedQuery(name = "Proyectos.findByIdproyectos", query = "SELECT p FROM Proyectos p WHERE p.idproyectos = :idproyectos"),
    @NamedQuery(name = "Proyectos.findByCodProyecto", query = "SELECT p FROM Proyectos p WHERE p.codProyecto = :codProyecto"),
    @NamedQuery(name = "Proyectos.findByNombreProyecto", query = "SELECT p FROM Proyectos p WHERE p.nombreProyecto = :nombreProyecto"),
    @NamedQuery(name = "Proyectos.findByFechaIniProyecto", query = "SELECT p FROM Proyectos p WHERE p.fechaIniProyecto = :fechaIniProyecto"),
    @NamedQuery(name = "Proyectos.findByFechaEstimadaFinProyecto", query = "SELECT p FROM Proyectos p WHERE p.fechaEstimadaFinProyecto = :fechaEstimadaFinProyecto"),
    @NamedQuery(name = "Proyectos.findByFechaFinProyecto", query = "SELECT p FROM Proyectos p WHERE p.fechaFinProyecto = :fechaFinProyecto"),
    @NamedQuery(name = "Proyectos.findByTiempoMuertoProyecto", query = "SELECT p FROM Proyectos p WHERE p.tiempoMuertoProyecto = :tiempoMuertoProyecto"),
    @NamedQuery(name = "Proyectos.findByCostoProyecto", query = "SELECT p FROM Proyectos p WHERE p.costoProyecto = :costoProyecto"),
    @NamedQuery(name = "Proyectos.findByEstadoProyecto", query = "SELECT p FROM Proyectos p WHERE p.estadoProyecto = :estadoProyecto")})
public class Proyectos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproyectos")
    private Integer idproyectos;
    @Column(name = "cod_proyecto")
    private String codProyecto;
    @Column(name = "nombre_proyecto")
    private String nombreProyecto;
    @Column(name = "fecha_ini_proyecto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIniProyecto;
    @Column(name = "fecha_estimada_fin_proyecto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEstimadaFinProyecto;
    @Column(name = "fecha_fin_proyecto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinProyecto;
    @Column(name = "tiempo_muerto_proyecto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempoMuertoProyecto;
    @Column(name = "costo_proyecto")
    private Long costoProyecto;
    @Column(name = "estado_proyecto")
    private Boolean estadoProyecto;
    @OneToMany(mappedBy = "idProyecto")
    private List<Productos> productosList;

    public Proyectos() {
    }

    public Proyectos(Integer idproyectos) {
        this.idproyectos = idproyectos;
    }

    public Integer getIdproyectos() {
        return idproyectos;
    }

    public void setIdproyectos(Integer idproyectos) {
        this.idproyectos = idproyectos;
    }

    public String getCodProyecto() {
        return codProyecto;
    }

    public void setCodProyecto(String codProyecto) {
        this.codProyecto = codProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Date getFechaIniProyecto() {
        return fechaIniProyecto;
    }

    public void setFechaIniProyecto(Date fechaIniProyecto) {
        this.fechaIniProyecto = fechaIniProyecto;
    }

    public Date getFechaEstimadaFinProyecto() {
        return fechaEstimadaFinProyecto;
    }

    public void setFechaEstimadaFinProyecto(Date fechaEstimadaFinProyecto) {
        this.fechaEstimadaFinProyecto = fechaEstimadaFinProyecto;
    }

    public Date getFechaFinProyecto() {
        return fechaFinProyecto;
    }

    public void setFechaFinProyecto(Date fechaFinProyecto) {
        this.fechaFinProyecto = fechaFinProyecto;
    }

    public Date getTiempoMuertoProyecto() {
        return tiempoMuertoProyecto;
    }

    public void setTiempoMuertoProyecto(Date tiempoMuertoProyecto) {
        this.tiempoMuertoProyecto = tiempoMuertoProyecto;
    }

    public Long getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(Long costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

    public Boolean getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(Boolean estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproyectos != null ? idproyectos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyectos)) {
            return false;
        }
        Proyectos other = (Proyectos) object;
        if ((this.idproyectos == null && other.idproyectos != null) || (this.idproyectos != null && !this.idproyectos.equals(other.idproyectos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.american.doors.model.Proyectos[ idproyectos=" + idproyectos + " ]";
    }
    
}
