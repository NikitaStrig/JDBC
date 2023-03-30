package org.example;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args)   {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        EmployeeDAO employeeDAOfull = new EmployeeDAOint();
        employeeDAOfull.createUser2();
        employeeDAOfull.allObject();
        employeeDAOfull.update(19);
        employeeDAOfull.specifically(19);
        employeeDAOfull.deleteUser(19);

        entityManager.close();
        entityManagerFactory.close();
        }
    }

