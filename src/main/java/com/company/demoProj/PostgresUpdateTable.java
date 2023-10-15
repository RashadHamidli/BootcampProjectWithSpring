package com.company.demoProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgresUpdateTable {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/user_register", "postgres", "admin");
             PreparedStatement statement = connection.prepareStatement("UPDATE student SET student_name = 'sdfvrfv' WHERE student_name = 'Farhad'");) {
            statement.executeUpdate();
            System.out.println("update successfully");
        } catch (SQLException e) {
            e.getStackTrace();
            System.out.println("update none success");
        }
    }
}
