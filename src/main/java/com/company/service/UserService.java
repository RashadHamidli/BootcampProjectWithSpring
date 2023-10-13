package com.company.service;

import com.company.entity.User;
import com.company.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserService {

    public User getUser(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        User st = session.get(User.class, id);
        session.close();
        return st;
    }

    public String addUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
        return "User added";
    }


    public String deleteUser(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        User st = session.get(User.class, id);
        session.delete(st);
        transaction.commit();
        session.close();
        return "User deleted";
    }

    public String updateUser(long id, User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        User st = session.get(User.class, id);
        session.update(user);
        transaction.commit();
        session.close();
        return "User updated";
    }
}
