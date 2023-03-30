package org.example;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> createUser2();
    void deleteUser(int idn);
    void specifically(int idn);
    void update(int idn);
    void allObject();

}
