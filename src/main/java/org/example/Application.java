package org.example;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args)   {
        City city = new City("fora");
      Employee employee = new Employee("Vasy56","vasy","M",34, city.getid());
        EmployeeDAO employeeDAOfull = new EmployeeDAOint();
       // employeeDAOfull.createUser2(employee);
       // employeeDAOfull.allObject();
        employeeDAOfull.update(employee, 1);
       // employeeDAOfull.specifically(4);
       // employeeDAOfull.deleteUser(employee, 2);
        CityDAO cityDAOall = new CityDAOcomplite();
       // cityDAOall.create();
        cityDAOall.delete(1);

        }
    }

