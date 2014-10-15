/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.american.doors.test;

import com.american.doors.model.Proyectos;
import java.io.InputStream;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
/**
 *
 * @author hugo-aguilar
 */
public class TestConnection {
    
    private static final String PERSISTENCE_UNIT_NAME = "PU";
    private static EntityManagerFactory factory;
    static final Logger log = Logger.getLogger(TestConnection.class);
     
    //static Logger log = Logger.getLogger(TestConnection.class.getName());
    
    public static void main(String[] args) {
        
        try {
            String g = TestConnection.class.getResource("/com/american/doors/config/log4j.xml").getPath();
            
            DOMConfigurator.configure(g);
            log.info("Log4j Configured using XML configurator"); 
           
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            EntityManager em = factory.createEntityManager();
            
            Proyectos p=em.find(Proyectos.class, 1);
            System.out.println(p.getCodProyecto());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
