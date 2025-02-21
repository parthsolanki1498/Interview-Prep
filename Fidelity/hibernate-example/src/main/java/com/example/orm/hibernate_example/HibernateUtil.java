package com.example.orm.hibernate_example;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create SessionFactory from cfg
            sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                            .addAnnotatedClass(Employee.class)
                            .buildSessionFactory();
        } catch(Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    } 
}
