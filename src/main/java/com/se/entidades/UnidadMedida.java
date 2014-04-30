/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.se.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Willian
 */
@Entity
@Table(name = "unidad_medida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadMedida.findAll", query = "SELECT u FROM UnidadMedida u")})
public class UnidadMedida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idunidad_medida")
    private Integer idunidadMedida;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idunidadMedida")
    private List<MateriaPrima> materiaPrimaList;

    public UnidadMedida() {
    }

    public UnidadMedida(Integer idunidadMedida) {
        this.idunidadMedida = idunidadMedida;
    }

    public Integer getIdunidadMedida() {
        return idunidadMedida;
    }

    public void setIdunidadMedida(Integer idunidadMedida) {
        this.idunidadMedida = idunidadMedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<MateriaPrima> getMateriaPrimaList() {
        return materiaPrimaList;
    }

    public void setMateriaPrimaList(List<MateriaPrima> materiaPrimaList) {
        this.materiaPrimaList = materiaPrimaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidadMedida != null ? idunidadMedida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadMedida)) {
            return false;
        }
        UnidadMedida other = (UnidadMedida) object;
        if ((this.idunidadMedida == null && other.idunidadMedida != null) || (this.idunidadMedida != null && !this.idunidadMedida.equals(other.idunidadMedida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.se.entidades.UnidadMedida[ idunidadMedida=" + idunidadMedida + " ]";
    }
    
}
