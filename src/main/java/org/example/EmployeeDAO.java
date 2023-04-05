package org.example;

import java.util.List;

public interface EmployeeDAO {
    Employee createUser2(Employee employee);
    Employee deleteUser(Employee employee, int id);
    void specifically(int id);
    Employee update(Employee employee, int id);
    void allObject();

}
