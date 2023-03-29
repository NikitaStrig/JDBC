package org.example;

import java.sql.*;

public class SpecificallyObject implements EmployeeDAO {
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
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM employee WHERE ID =" + idn);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                System.out.println("ID : " + id);

                String firstName = resultSet.getString("first_name");
                System.out.println("Имя: " + firstName );
                String lasttName = resultSet.getString("last_name");
                System.out.println("Фамилия: " + lasttName );
                String gender = resultSet.getString("gender");
                System.out.println("Пол: " + gender );
                int age = resultSet.getInt("age");
                System.out.println("Возрост : " + age);
                int cityId = resultSet.getInt("city_id");
                System.out.println("Город : " + cityId);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
        }

    }

    @Override
    public void update(int idn) {

    }

    @Override
    public void allObject() {

    }
}
