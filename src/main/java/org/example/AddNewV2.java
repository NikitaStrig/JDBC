package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AddNewV2 implements EmployeeDAO{
    private final String user = "postgres";
    private final String password = "88635005";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";

    @Override
    public void createUser() {

    }

    @Override
    public List<Employee> createUser2() {
        List<Employee> employees = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM employee");
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
                System.out.println("-----------------");
                employees.add(new Employee(id,firstName,lasttName,gender,age,cityId));
                for (int i = 0; i < employees.size(); i++) {
                    System.out.println(employees.get(i));

                }
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
        }
        return employees;
    }

    @Override
    public void deleteUser(int idn) {

    }

    @Override
    public void specifically(int idn) {

    }

    @Override
    public void update(int idn) {

    }

    @Override
    public void allObject() {

    }
}
