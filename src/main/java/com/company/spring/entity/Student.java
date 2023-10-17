package com.company.spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@NamedQuery(
        name = "findAll",
        query = "SELECT s FROM Student s"
)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_surname")
    private String surname;
    @Column(name = "student_email")
    private String email;
    @Column(name="student_password")
    @Transient
    private String password;

    public Student(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password=password;
    }
}
