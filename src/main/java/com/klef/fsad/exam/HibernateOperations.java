package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOperations {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Hospital h = new Hospital();
        h.setName("Apollo");
        h.setDescription("Emergency Care");
        h.setStatus("Active");
        h.setDate(new java.util.Date());

        session.persist(h);
        t.commit();

        System.out.println("Success!");
        session.close();
        factory.close();
    }
}