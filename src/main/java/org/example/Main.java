package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsAge(23);
        s1.setRollNo(5);
        s1.setsName("hanuman");

        SessionFactory sf =new Configuration()
                               .addAnnotatedClass(org.example.Student.class)
                               .configure()
                               .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();
        session.close();

        System.out.print(s1);
    }
}