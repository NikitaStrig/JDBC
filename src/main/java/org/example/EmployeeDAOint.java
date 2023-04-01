package org.example;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.List;

public class EmployeeDAOint implements EmployeeDAO{

    @Override
    public Employee createUser2() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        // Создаем экземпляр EntityManager из EntityManagerFactory
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // Начинаем транзакцию
        entityManager.getTransaction().begin();
        Employee employeeCre = new Employee();
        employeeCre.setFirst_name("Hiri");
        employeeCre.setLast_name("Givi");
        employeeCre.setGender("Male");
        employeeCre.setAge(3);
        employeeCre.setCity_id(2);
        entityManager.persist(employeeCre);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return employeeCre;
    }

    @Override
    public Employee deleteUser(Employee employee, int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        // Создаем экземпляр EntityManager из EntityManagerFactory
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // Начинаем транзакцию
        entityManager.getTransaction().begin();
        Employee employeeDel = entityManager.find(Employee.class, id);
        entityManager.remove(employeeDel);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return employeeDel;
    }

    @Override
    public void specifically(int ids) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        String empSp = "SELECT s FROM Employee s WHERE s.id =" + ids;
        TypedQuery<Employee> query = entityManager.createQuery(empSp, Employee.class);
        List<Employee> employees = query.getResultList();
        entityManager.getTransaction().commit();
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getFirst_name());
            System.out.println("Age: " + employee.getAge());
            System.out.println("------------");
        }

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public Employee update( Employee employee, int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        // Создаем экземпляр EntityManager из EntityManagerFactory
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // Начинаем транзакцию
        entityManager.getTransaction().begin();
        Employee employeeDel = entityManager.find(Employee.class, id);
       employeeDel.setFirst_name(employee.getFirst_name());
        entityManager.merge(employeeDel);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return employeeDel;
    }

    @Override
    public void allObject() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        String empSp = "SELECT s FROM Employee s";
        TypedQuery<Employee> query = entityManager.createQuery(empSp, Employee.class);
        List<Employee> employees = query.getResultList();
        entityManager.getTransaction().commit();
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getFirst_name());
            System.out.println("Age: " + employee.getAge());
            System.out.println("------------");
        }

    }
}
