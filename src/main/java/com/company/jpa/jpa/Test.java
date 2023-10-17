package com.company.jpa.jpa;

import jakarta.persistence.*;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("rashadPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        for (Object findAll : em.createNamedQuery("findAll").getResultList()) {
            System.out.println(findAll);
        }

        Query query = em.createQuery("SELECT p FROM Student p WHERE p.name = :name");
        query.setParameter("name", "Rashad");
        List results = query.getResultList();
        results.forEach(System.out::println);

        System.out.println("------------------------");

        Query nativeQuery = em.createNativeQuery("SELECT s.* FROM Student s");
        List list = nativeQuery.getResultList();
        list.forEach(System.out::println);

        et.commit();
        emf.close();
        em.close();

    }
}
