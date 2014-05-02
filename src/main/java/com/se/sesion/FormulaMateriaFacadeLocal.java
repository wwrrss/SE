/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.se.sesion;

import com.se.entidades.FormulaMateria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Willian
 */
@Local
public interface FormulaMateriaFacadeLocal {

    void create(FormulaMateria formulaMateria);

    void edit(FormulaMateria formulaMateria);

    void remove(FormulaMateria formulaMateria);

    FormulaMateria find(Object id);

    List<FormulaMateria> findAll();

    List<FormulaMateria> findRange(int[] range);

    int count();
    
}
