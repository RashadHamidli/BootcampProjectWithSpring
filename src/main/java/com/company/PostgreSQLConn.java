package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLConn {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/user_register";
        String user = "postgres";
        String pass = "admin";

        try (Connection connection = DriverManager.getConnection(url, user, pass);
             Statement statement = connection.createStatement()) {
            String sqlSorgusu = """
                      CREATE TABLE student (
                      student_id INT GENERATED ALWAYS AS IDENTITY,
                      student_name VARCHAR(20) NOT NULL,
                      student_surname VARCHAR(30) NOT NULL DEFAULT 'SEZER',
                      student_email VARCHAR(50) NOT NULL,
                      CONSTRAINT PK_id PRIMARY KEY(student_id)
                    );
                    """;
            statement.executeUpdate(sqlSorgusu);
            System.out.println("Tablo başarıyla oluşturuldu.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
