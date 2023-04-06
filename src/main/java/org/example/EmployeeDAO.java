package org.example;

import java.util.List;

public interface EmployeeDAO {
    Employee create(Employee employee);
    Employee delete(Employee employee, int id);
    void specifically(int id);
    Employee update(Employee employee, int id);
    void allObject();

}
