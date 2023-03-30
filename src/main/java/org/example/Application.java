package org.example;
import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args)   {

        EmployeeDAO employeeDAOfull = new EmployeeDAOint();
        employeeDAOfull.createUser2();
        employeeDAOfull.allObject();
        employeeDAOfull.update(19);
        employeeDAOfull.specifically(19);
        employeeDAOfull.deleteUser(19);


        }
    }

