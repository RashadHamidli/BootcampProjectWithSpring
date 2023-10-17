package com.company.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PostgresDeleteTable {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/user_register", "postgres", "admin");
             PreparedStatement statement = connection.prepareStatement("Delete from student where student_id=?")) {
            System.out.print("silmek istediyiniz id-ni daxil edin:");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            statement.setInt(1, i);
            statement.executeUpdate();
            System.out.println("delete successfully");
        } catch (SQLException e) {
            e.getStackTrace();
            System.out.println("delete failed");
        }
    }
}
