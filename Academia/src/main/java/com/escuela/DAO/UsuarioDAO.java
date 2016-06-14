/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuela.DAO;

import com.escuela.academia.Alumno;
import java.util.List;
import javax.sql.DataSource;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author CF
 */
@Repository
@Transactional
public class UsuarioDAO {

    @Autowired
    private DataSource dataSource; // se pdoría usar también...
    @Autowired
    private SessionFactory sessionFactory;

    static final org.slf4j.Logger LOG = LoggerFactory.getLogger(UsuarioDAO.class);

    public boolean autenticar(Alumno usuario) {
       Query query = sessionFactory.getCurrentSession().
                createQuery("FROM Usuario U WHERE U.email =:pemail and U.clave=:pclave");
       query.setParameter("pemail", usuario.getCodigo());
       query.setParameter("pclave", usuario.getClave());
       return !query.list().isEmpty();
    }
   
}
