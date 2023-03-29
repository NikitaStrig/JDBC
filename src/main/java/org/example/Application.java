package org.example;
import java.sql.*;
import java.util.List;

public class Application {
    private final String user = "postgres";
    private final String password = "88635005";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";
    public static void main(String[] args)   {

        EmployeeDAO employeeDAOCreate = new AddEmployee();
        EmployeeDAO employeeDAODelete = new DeleteEmployee();
        EmployeeDAO employeeDAOupdate = new Update();
        EmployeeDAO employeeDAOspecifically = new SpecificallyObject();
        EmployeeDAO employeeDAOAllObject = new AllObject();
        EmployeeDAO employeeDAOCreateN = new AddNewV2();

        employeeDAOCreate.createUser();
        employeeDAOAllObject.allObject();
        employeeDAOupdate.update(15);
        employeeDAOspecifically.specifically(15);
        employeeDAODelete.deleteUser(15);
        employeeDAOCreateN.createUser2();

        }
    }

