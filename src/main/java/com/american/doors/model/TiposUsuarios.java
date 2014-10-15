/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.american.doors.model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hugo-aguilar
 */
@Entity
@Table(name = "tipos_usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposUsuarios.findAll", query = "SELECT t FROM TiposUsuarios t"),
    @NamedQuery(name = "TiposUsuarios.findByIdTiposUsuarios", query = "SELECT t FROM TiposUsuarios t WHERE t.idTiposUsuarios = :idTiposUsuarios"),
    @NamedQuery(name = "TiposUsuarios.findByNombre", query = "SELECT t FROM TiposUsuarios t WHERE t.nombre = :nombre")})
public class TiposUsuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipos_usuarios")
    private Integer idTiposUsuarios;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idTiposUsuarios")
    private List<Usuarios> usuariosList;

    public TiposUsuarios() {
    }

    public TiposUsuarios(Integer idTiposUsuarios) {
        this.idTiposUsuarios = idTiposUsuarios;
    }

    public Integer getIdTiposUsuarios() {
        return idTiposUsuarios;
    }

    public void setIdTiposUsuarios(Integer idTiposUsuarios) {
        this.idTiposUsuarios = idTiposUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTiposUsuarios != null ? idTiposUsuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposUsuarios)) {
            return false;
        }
        TiposUsuarios other = (TiposUsuarios) object;
        if ((this.idTiposUsuarios == null && other.idTiposUsuarios != null) || (this.idTiposUsuarios != null && !this.idTiposUsuarios.equals(other.idTiposUsuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.american.doors.model.TiposUsuarios[ idTiposUsuarios=" + idTiposUsuarios + " ]";
    }
    
}
