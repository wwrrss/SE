/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.se.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Willian
 */
@Entity
@Table(name = "formula_materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormulaMateria.findAll", query = "SELECT f FROM FormulaMateria f")})
public class FormulaMateria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idformula_materia")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private BigDecimal cantidad;
    @JoinColumn(name = "id_materia", referencedColumnName = "idmateria_prima")
    @ManyToOne(optional = false)
    private MateriaPrima materiaPrima;
    @JoinColumn(name = "id_formula", referencedColumnName = "idformula_producto")
    @ManyToOne(optional = false)
    private FormulaProducto formula;

    public FormulaMateria() {
    }

    public FormulaMateria(Integer idformulaMateria) {
        this.id = idformulaMateria;
    }

    public FormulaMateria(Integer idformulaMateria, BigDecimal cantidad) {
        this.id = idformulaMateria;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public FormulaProducto getFormula() {
        return formula;
    }

    public void setFormula(FormulaProducto formula) {
        this.formula = formula;
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
        if (!(object instanceof FormulaMateria)) {
            return false;
        }
        FormulaMateria other = (FormulaMateria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.se.entidades.FormulaMateria[ idformulaMateria=" + id + " ]";
    }
    
}
