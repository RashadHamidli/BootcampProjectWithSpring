package com.company.service;

import com.company.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserService {
    public String addUser() {
        Student student = new Student();
        student.setName("Ehmed");
        student.setSurname("Memmedov");

        long id = 4;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Student st = session.get(Student.class, id);
        session.save(st);
        transaction.commit();
        session.close();
        return null;
    }
}
