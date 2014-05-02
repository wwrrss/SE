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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Willian
 */
@Entity
@Table(name = "formula_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormulaProducto.findAll", query = "SELECT f FROM FormulaProducto f")})
public class FormulaProducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idformula_producto")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formula")
    private List<FormulaMateria> materias;
    @JoinColumn(name = "id_producto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Producto producto;

    public FormulaProducto() {
    }

    public FormulaProducto(Integer idformulaProducto) {
        this.id = idformulaProducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public List<FormulaMateria> getMaterias() {
        return materias;
    }

    public void setMaterias(List<FormulaMateria> materias) {
        this.materias = materias;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormulaProducto)) {
            return false;
        }
        FormulaProducto other = (FormulaProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.se.entidades.FormulaProducto[ idformulaProducto=" + id + " ]";
    }
    
}
