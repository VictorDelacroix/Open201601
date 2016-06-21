/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuela.DAO;

import com.upc.config.AppConfig;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author operador
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

    @org.junit.Test
    public void testSomeMethod() {
         //cargando el contexto de Spring
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UsuarioDAO usuarioDAO = context.getBean(UsuarioDAO.class);
        
        assertTrue(usuarioDAO.autenticar(1));
    }
    
}
