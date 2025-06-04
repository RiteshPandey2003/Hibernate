package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsAge(23);
        s1.setRollNo(1);
        s1.setsName("ram");

        Configuration cf = new Configuration();
        SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.openSession();
        session.save(s1);

        System.out.print(s1);
    }
}