package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");

        // Создаем экземпляр EntityManager из EntityManagerFactory
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // Начинаем транзакцию
        entityManager.getTransaction().begin();
        City city = new City("fora");
        entityManager.persist(city);
        Stream.of(new Employee("Vasy","vasy","M",34, city),
                new Employee("Vasy2","vasy2","M",35, city))
                        .peek(employee -> employee.setCity_id(city.getid()))
                                .forEach(entityManager::persist);
        entityManager.persist(city);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}