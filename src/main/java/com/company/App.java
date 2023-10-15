package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/user_register";
        String user = "postgres";
        String pass = "admin";

        try (Connection connection = DriverManager.getConnection(url, user, pass);
             Statement statement = connection.createStatement()) {
            String sqlSorgusu = """
                      CREATE TABLE kisiler (
                      kisi_sira INT GENERATED ALWAYS AS IDENTITY,
                      kisi_adi VARCHAR(20) NOT NULL,
                      kisi_soyadi VARCHAR(30) NOT NULL DEFAULT 'SEZER',
                      kisi_eposta VARCHAR(50) NOT NULL,
                      CONSTRAINT PK_sira PRIMARY KEY(kisi_sira)
                    );
                    """;
            statement.executeUpdate(sqlSorgusu);
            System.out.println("Tablo başarıyla oluşturuldu.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
