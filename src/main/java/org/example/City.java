package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "City")
public class City {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private  String name;

@OneToMany(mappedBy = "city",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Employee> employees;

    public City(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public City() {

    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
