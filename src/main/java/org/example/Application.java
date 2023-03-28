package org.example;
import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args)   {
        EmployeeDAO employeeDAO = new AddEmployee();
       // employeeDAO.createUser();
        employeeDAO.deleteUser();
        }
    }

