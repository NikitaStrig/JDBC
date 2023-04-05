package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.stream.Stream;

public class CityDAOcomplite implements CityDAO{
    @Override
    public City delete(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        City city = new City("fora");
        City cityDel = entityManager.find(City.class, id);
        entityManager.remove(cityDel);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return city;
    }

    @Override
    public void create() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
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
