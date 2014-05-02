/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.se.web;

import com.se.sesion.ProductoFacadeLocal;
import javax.ejb.EJB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Willian
 */
@Controller
public class ControladorProducto {
    
    @EJB(mappedName = "java:module/ProductoFacade")
    private ProductoFacadeLocal productoFacade;
    
    @RequestMapping(value = "/productos")
    public String getProductos(Model modelo){
        modelo.addAttribute("productos", productoFacade.findAll());
        return "/producto/lista";
    }
}
