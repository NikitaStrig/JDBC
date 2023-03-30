package org.example;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> createUser2();
    void deleteUser(Employee id);
    void specifically(Employee id);
    void update(Employee id);
    void allObject();

}
