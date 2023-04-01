package org.example;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args)   {
Employee employee = new Employee("Vasy","vasy","M",34,2);
        EmployeeDAO employeeDAOfull = new EmployeeDAOint();
        employeeDAOfull.createUser2(employee);
        employeeDAOfull.allObject();
        employeeDAOfull.update(employee, 2);
        employeeDAOfull.specifically(4);
        employeeDAOfull.deleteUser(employee, 2);

        }
    }

