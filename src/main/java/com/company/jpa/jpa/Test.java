package com.company.jpa.jpa;

import com.company.spring.entity.Student;
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
        System.out.println("------------------------");

        Query query = em.createQuery("SELECT p FROM Student p WHERE p.name = :name");
        query.setParameter("name", "Rashad");
        List results = query.getResultList();
        results.forEach(System.out::println);

        TypedQuery<Student> query1 = em.createQuery("SELECT p FROM Student p WHERE p.name = :name", Student.class);
        TypedQuery<Student> s = query1.setParameter("name", "Rashad");
        List<Student> results1 = s.getResultList();

        results1.forEach((person) -> {
            System.out.println(person.getName());
        });

        System.out.println("------------------------");

        Query nativeQuery = em.createNativeQuery("SELECT s.* FROM Student s");
        List list = nativeQuery.getResultList();
        list.forEach(System.out::println);

        et.commit();
        emf.close();
        em.close();

    }
}
