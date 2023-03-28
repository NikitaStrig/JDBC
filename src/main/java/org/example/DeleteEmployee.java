package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeleteEmployee implements EmployeeDAO {
    private final String user = "postgres";
    private final String password = "88635005";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";


    @Override
    public void createUser() {

    }

    @Override
    public void deleteUser() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("DELETE FROM employee WHERE ID = 12");
            System.out.printf("%d row(s) deleted", rows);
        } catch (Exception ex) {
            System.out.println("Connection failed...");
        }
    }
}

