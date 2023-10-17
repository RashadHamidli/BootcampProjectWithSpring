package com.company.app.jdbc;

import java.io.PrintWriter;
import java.sql.*;

public class PostgresUpdateTable {
    public static void main(String[] args) {
        String query1 = "UPDATE student SET student_name = 'a' WHERE student_name = 'A'";
        String query2 = "UPDATE student SET student_name = 'b' WHERE student_name = 'B'";
        String query3 = "UPDATE student SET student_name = 'c' WHERE student_name = 'C'";
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/user_register?user=postgres&password=admin");
             Statement statement = connection.createStatement()) {
            statement.addBatch(query1);
            statement.addBatch(query2);
            statement.addBatch(query3);
            statement.executeBatch();
            System.out.println("update successfully");
        } catch (SQLException e) {
            e.getStackTrace();
            System.out.println("update none success");
        }
    }
}
