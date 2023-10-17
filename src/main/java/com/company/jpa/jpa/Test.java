package com.company.jpa.jpa;

import jakarta.persistence.*;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("rashadPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        for (Object findAll : em.createNamedQuery("findAll").getResultList()) {
            System.out.println(findAll);
        }


//        Query nativeQuery = em.createNativeQuery("SELECT s.student_name FROM student s");
//        if(!et.isActive()){
//            et.rollback();
//            return;
//        }
//        System.out.println("student names: " + nativeQuery.getResultList());
        et.commit();
        emf.close();
        em.close();

    }
}
