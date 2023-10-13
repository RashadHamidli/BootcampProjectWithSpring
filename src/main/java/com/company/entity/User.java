package com.company.entity;

import com.company.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class User {

    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Farhad");
        student.setSurname("Valizade");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

}
