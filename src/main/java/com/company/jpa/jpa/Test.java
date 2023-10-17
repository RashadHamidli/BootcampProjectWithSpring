package com.company.jpa.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("rashadPU");
        EntityManager em = emf.createEntityManager();
        Query nativeQuery = em.createNativeQuery("select * from student where student_id=1;");
        emf.close();
        em.close();

    }
}
