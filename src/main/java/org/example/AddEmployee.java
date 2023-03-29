package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddEmployee implements EmployeeDAO {
    private final String user = "postgres";
    private final String password = "88635005";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";



    @Override
    public void createUser() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("INSERT INTO employee (first_name, last_name, gender, age) VALUES ('Sergey', 'Ivanov', 'Male', 50);");
            System.out.printf("Added %d rows", rows);
        } catch (Exception ex) {
            System.out.println("Connection failed...");

        }
    }

    @Override
    public void deleteUser(int idn) {

    }


}


