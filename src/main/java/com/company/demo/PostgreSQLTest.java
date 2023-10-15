package com.company.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/user_register";
        String userName = "postgres";
        String password = "admin";

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {
            String sqlQuery = """
                    CREATE TABLE teacher (
                                          teacher_id INT GENERATED ALWAYS AS IDENTITY,
                                          teacher_name VARCHAR(20) NOT NULL,
                                          teacher_surname VARCHAR(30) NOT NULL DEFAULT 'SEZER',
                                          teacher_email VARCHAR(50) NOT NULL,
                                          CONSTRAINT student_id PRIMARY KEY(teacher_id)
                                        );
                    """;
            statement.executeUpdate(sqlQuery);
            System.out.println("table created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
