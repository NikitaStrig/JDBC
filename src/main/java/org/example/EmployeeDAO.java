package org.example;

import java.util.List;

public interface EmployeeDAO {
    void createUser();
    void deleteUser(int idn);
    void specifically(int idn);
    void update(int idn);
    void allObject();

}
