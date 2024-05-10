package com.example.reservervation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.time.LocalDate;


public class app {
    public static void main(String[] args) {
       /* System.out.println("hey main");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        SessionFactory factory = new Configuration().configure("hibernate.xml").buildSessionFactory();
        System.out.println(factory);*/

        SessionFactory factory=   HibernateUtil.getSessionFactory();


        vol v=new vol();
        v.setId_vol(2);

        v.setVille_depart("fes");
        v.setDestination("tabger");
        v.setDate_depart(LocalDate.of(2023,05,05) );
        v.setDate_retour(LocalDate.of(2023,07,07) );
        v.setNbr_passager(30);
        v.setComp_aeri("RAM");
        v.setPrix(1000);
        v.setDuree(30);
        Session session=factory.openSession();

        Transaction tx=session.beginTransaction();

        session.save(v);
        System.out.println(factory);
        tx.commit();
        session.close();
    }
}
