/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.se.entidades;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Willian
 */
@Entity
@Table(name = "materia_prima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriaPrima.findAll", query = "SELECT m FROM MateriaPrima m")})
public class MateriaPrima implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmateria_prima")
    private Integer idmateriaPrima;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "idunidad_medida", referencedColumnName = "idunidad_medida")
    @ManyToOne(optional = false)
    private UnidadMedida idunidadMedida;

    public MateriaPrima() {
    }

    public MateriaPrima(Integer idmateriaPrima) {
        this.idmateriaPrima = idmateriaPrima;
    }

    public MateriaPrima(Integer idmateriaPrima, String descripcion) {
        this.idmateriaPrima = idmateriaPrima;
        this.descripcion = descripcion;
    }

    public Integer getIdmateriaPrima() {
        return idmateriaPrima;
    }

    public void setIdmateriaPrima(Integer idmateriaPrima) {
        this.idmateriaPrima = idmateriaPrima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public UnidadMedida getIdunidadMedida() {
        return idunidadMedida;
    }

    public void setIdunidadMedida(UnidadMedida idunidadMedida) {
        this.idunidadMedida = idunidadMedida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmateriaPrima != null ? idmateriaPrima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaPrima)) {
            return false;
        }
        MateriaPrima other = (MateriaPrima) object;
        if ((this.idmateriaPrima == null && other.idmateriaPrima != null) || (this.idmateriaPrima != null && !this.idmateriaPrima.equals(other.idmateriaPrima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.se.entidades.MateriaPrima[ idmateriaPrima=" + idmateriaPrima + " ]";
    }
    
}
