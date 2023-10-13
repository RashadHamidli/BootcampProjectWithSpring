package com.company.service;

import com.company.entity.Users;
import com.company.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public Users getUser(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Users st = session.get(Users.class, id);
        session.close();
        return st;
    }

    public String addUser(Users users) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(users);
        transaction.commit();
        session.close();
        return "Users added";
    }


    public String deleteUser(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Users st = session.get(Users.class, id);
        session.delete(st);
        transaction.commit();
        session.close();
        return "Users deleted";
    }

    public String updateUser(long id, Users users) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Users st = session.get(Users.class, id);
        session.update(users);
        transaction.commit();
        session.close();
        return "Users updated";
    }
}
