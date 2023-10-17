package com.company.jpa.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("rashadPU");
        EntityManager em = emf.createEntityManager();
        Query nativeQuery = em.createNativeQuery("select * from student s ");
        System.out.println("-----------------------------");
        for (Object o : nativeQuery.getResultList()) {
            System.out.println(o);
        }
        System.out.println("-----------------------------");
        em.close();
        emf.close();
    }
}
