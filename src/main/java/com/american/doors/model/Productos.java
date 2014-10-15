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
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findByIdProducto", query = "SELECT p FROM Productos p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Productos.findByNombreProducto", query = "SELECT p FROM Productos p WHERE p.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "Productos.findByDescripcionProducto", query = "SELECT p FROM Productos p WHERE p.descripcionProducto = :descripcionProducto"),
    @NamedQuery(name = "Productos.findByImportado", query = "SELECT p FROM Productos p WHERE p.importado = :importado"),
    @NamedQuery(name = "Productos.findByHorasDelProyecto", query = "SELECT p FROM Productos p WHERE p.horasDelProyecto = :horasDelProyecto"),
    @NamedQuery(name = "Productos.findByPrecioHoras", query = "SELECT p FROM Productos p WHERE p.precioHoras = :precioHoras")})
public class Productos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Column(name = "descripcion_producto")
    private String descripcionProducto;
    @Column(name = "importado")
    private Boolean importado;
    @Column(name = "horas_del_proyecto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horasDelProyecto;
    @Column(name = "precio_horas")
    private Long precioHoras;
    @OneToMany(mappedBy = "idProducto")
    private List<Fases> fasesList;
    @JoinColumn(name = "id_proyecto", referencedColumnName = "idproyectos")
    @ManyToOne
    private Proyectos idProyecto;

    public Productos() {
    }

    public Productos(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Boolean getImportado() {
        return importado;
    }

    public void setImportado(Boolean importado) {
        this.importado = importado;
    }

    public Date getHorasDelProyecto() {
        return horasDelProyecto;
    }

    public void setHorasDelProyecto(Date horasDelProyecto) {
        this.horasDelProyecto = horasDelProyecto;
    }

    public Long getPrecioHoras() {
        return precioHoras;
    }

    public void setPrecioHoras(Long precioHoras) {
        this.precioHoras = precioHoras;
    }

    @XmlTransient
    public List<Fases> getFasesList() {
        return fasesList;
    }

    public void setFasesList(List<Fases> fasesList) {
        this.fasesList = fasesList;
    }

    public Proyectos getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Proyectos idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.american.doors.model.Productos[ idProducto=" + idProducto + " ]";
    }
    
}
