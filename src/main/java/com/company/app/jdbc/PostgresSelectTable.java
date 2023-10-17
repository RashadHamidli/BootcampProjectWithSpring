package com.company.app.jdbc;

import com.company.entity.Student;

import java.sql.*;

public class PostgresSelectTable {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/user_register", "postgres", "admin");
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select * from student");
            String columnCount = resultSet.getMetaData().getColumnClassName(2);
            System.out.println(columnCount);
            while (resultSet.next()) {
//                String name = resultSet.getString("student_name");
//                String surname = resultSet.getString("student_surname");
//                String email = resultSet.getString("student_email");
//
//                String format = String.format("%s, %s, %s", name, surname, email);
//                System.out.println(format);
                String frst = resultSet.getString(2);
                String sec = resultSet.getString(3);
                String th = resultSet.getString(4);
                String format = String.format("%s, %s, %s", frst, sec, th);
                System.out.println(format);
            }
        } catch (SQLException e) {
            e.getStackTrace();
            System.out.println("failed");
        }

    }
}
