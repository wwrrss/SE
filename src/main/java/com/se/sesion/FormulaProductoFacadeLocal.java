/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.se.sesion;

import com.se.entidades.FormulaProducto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Willian
 */
@Local
public interface FormulaProductoFacadeLocal {

    void create(FormulaProducto formulaProducto);

    void edit(FormulaProducto formulaProducto);

    void remove(FormulaProducto formulaProducto);

    FormulaProducto find(Object id);

    List<FormulaProducto> findAll();

    List<FormulaProducto> findRange(int[] range);

    int count();
    
}
