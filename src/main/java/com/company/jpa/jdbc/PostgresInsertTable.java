package com.company.jpa.jdbc;

import java.sql.*;
import java.util.Scanner;

public class PostgresInsertTable {
    public static void main(String[] args) {
        preparedStatementMethodScanner();
    }

    public static void preparedStatementMethodScanner() {
        String url = "jdbc:postgresql://localhost:5432/user_register";
        String uName = "postgres";
        String pass = "admin";

        String query = "Insert into student(student_name, student_surname, student_email) values(?,?,?)";

        try (Connection connection = DriverManager.getConnection(url, uName, pass);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("adinizi daxil edin:");
            String a = scanner.nextLine();
            System.out.print("soyadinizi daxil edin:");
            String b = scanner.nextLine();
            System.out.print("emailinizi daxil edin:");
            String c = scanner.nextLine();
            preparedStatement.setString(1, a);
            preparedStatement.setString(2, b);
            preparedStatement.setString(3, c);
            preparedStatement.executeUpdate();
            System.out.println("ugurla tamamlandi");
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static void preparedStatementMethod() {
        String url = "jdbc:postgresql://localhost:5432/user_register";
        String uName = "postgres";
        String pass = "admin";

        String query = """
                insert into student(student_name, student_surname, student_email) values(?,?,?);
                """;

        try (Connection connection = DriverManager.getConnection(url, uName, pass);
             PreparedStatement statement = connection.prepareStatement(query);) {
            statement.setString(1, "aaa");
            statement.setString(2, "aa");
            statement.setString(3, "aa@gmail.com");
            statement.executeUpdate();
            System.out.println("updated");
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public static void createStatementMethod() {
        String url = "jdbc:postgresql://localhost:5432/user_register";
        String uName = "postgres";
        String pass = "admin";

        String query = """
                Insert into student(student_name, student_surname, student_email)
                values('Rashad', 'Hamidli', 'mr_rashad@email.com')
                """;

        try (Connection connection = DriverManager.getConnection(url, uName, pass);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
            System.out.println("tabele updated");
        } catch (SQLException sqlException) {
            sqlException.getStackTrace();
        }
    }
}
