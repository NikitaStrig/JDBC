package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update implements EmployeeDAO{
    private final String user = "postgres";
    private final String password = "88635005";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";
    @Override
    public void createUser() {

    }

    @Override
    public void deleteUser(int idn) {

    }

    @Override
    public void specifically(int idn) {

    }

    @Override
    public void update(int idn) {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("UPDATE employee SET last_name = 'Petrovich' WHERE ID =" + idn);
            System.out.printf("%d row(s) update", rows);
        } catch (Exception ex) {
            System.out.println("Connection failed...");
        }
    }

    @Override
    public void allObject() {

    }
}
