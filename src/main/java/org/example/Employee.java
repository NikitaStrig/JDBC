package org.example;
import javax.persistence.*;
@Entity
@Table(name = "employee")
public class Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
   private int id;

   private String first_name;

   private String last_name;

    private String gender;

   private int age;
   private int city_id;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @ManyToOne
   @JoinColumn(name = "city_id", insertable = false, updatable = false)
   private City city;

    public Employee(String first_name, String last_name, String gender, int age, City city) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCity_id() {
        return city_id;
    }


    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }


}
