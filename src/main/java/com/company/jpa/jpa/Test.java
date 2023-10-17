package com.company.jpa.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("rashadPU");
        EntityManager em = emf.createEntityManager();
//        Query nativeQuery = em.createNativeQuery("SELECT count(s.student_id) FROM student s");
//        System.out.println("student sayi: " + nativeQuery.getSingleResult());
        Query nativeQuery = em.createNativeQuery("SELECT s.student_name FROM student s");
        for (Object o : nativeQuery.getResultList()) {
            System.out.println(o);
        }
        emf.close();
        em.close();

    }
}
