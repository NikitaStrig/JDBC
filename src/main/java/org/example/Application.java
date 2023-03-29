package org.example;
import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args)   {
        EmployeeDAO employeeDAOCreate = new AddEmployee();
       // employeeDAOCreate.createUser();
        EmployeeDAO employeeDAODelete = new DeleteEmployee();
        employeeDAODelete.deleteUser(11);
        }
    }

