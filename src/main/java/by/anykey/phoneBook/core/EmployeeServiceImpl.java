package by.anykey.phoneBook.core;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeServiceImpl implements funcPhoneBook{


    private static final AtomicInteger EMPLOYEE_ID = new AtomicInteger();

    @Override
    public void addEmployee(Employee employee) {
        final  int employeeId = EMPLOYEE_ID.incrementAndGet();
        employee.setId(employeeId);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public Employee getIdPerson(int id) {
        return null;
    }

    @Override
    public boolean updateEmployee(Employee person, int id) {
        return false;
    }

    @Override
    public boolean deleteEmplyeeId(int id) {
        return false;
    }
}
