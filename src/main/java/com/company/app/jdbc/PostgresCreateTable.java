package com.company.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresCreateTable {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/user_register";
        String uName = "postgres";
        String pass = "admin";

        try (Connection connection = DriverManager.getConnection(url, uName, pass);
             Statement statement = connection.createStatement()) {
            String sqlQuery = """
                     CREATE TABLE student (
                      student_id INT GENERATED ALWAYS AS IDENTITY,
                      student_name VARCHAR(20) NOT NULL,
                      student_surname VARCHAR(30) NOT NULL DEFAULT 'SEZER',
                      student_email VARCHAR(50) NOT NULL,
                      CONSTRAINT PK_id PRIMARY KEY(student_id)
                    );
                    """;
            statement.executeUpdate(sqlQuery);
            System.out.println("table yaradildi");
        } catch (SQLException sq) {
            sq.getStackTrace();
        }
    }
}
