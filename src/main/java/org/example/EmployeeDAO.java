package org.example;

import java.util.List;

public interface EmployeeDAO {
    Employee createUser2();
    Employee deleteUser(int id);
    void specifically(int id);
    Employee update(int id);
    void allObject();

}
