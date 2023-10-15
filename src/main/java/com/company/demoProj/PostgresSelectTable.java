package com.company.demoProj;

import com.company.entity.Student;

import java.sql.*;

public class PostgresSelectTable {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/user_register", "postgres", "admin");
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()) {
                String name = resultSet.getString("student_name");
                String surname = resultSet.getString("student_surname");
                String email = resultSet.getString("student_email");

                String format = String.format("%s, %s, %s", name, surname, email);
                System.out.println(format);
            }
        } catch (SQLException e) {
            e.getStackTrace();
            System.out.println("failed");
        }

    }
}
