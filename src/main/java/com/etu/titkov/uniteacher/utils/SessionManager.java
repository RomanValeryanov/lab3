package com.etu.titkov.uniteacher.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Level;

/**
 * Session util for creating entity manager factory
 * Uses lazy initialization
 *
 * @author Evgenii Ray
 */
public class SessionManager {
    private static EntityManagerFactory factory;

    public static EntityManager getEntityManager() {
        if(factory==null) {
            java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
            factory = Persistence.createEntityManagerFactory("default");
        }
        return factory.createEntityManager();
    }

    public static void terminate(){
        if(factory!=null){
            factory.close();
        }
    }
}

