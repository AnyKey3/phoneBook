package by.anykey.phoneBook.core;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeServiceImpl implements funcPhoneBook{


    private static final AtomicInteger EMPLOYEE_ID = new AtomicInteger();

    //добавить запись + автоинкремент
    @Override
    public void addEmployee(PhoneBook pB, Employee employee) {
        final  int employeeId = EMPLOYEE_ID.incrementAndGet();
        pB.getBook().put(employeeId, employee);
        //employee.setId(employeeId);

    }

    //весь список
    @Override
    public List<Employee> getAllEmployee(PhoneBook pB) {
        List<Employee> result = new ArrayList<Employee>();
        for (Employee emp: pB.getBook().values()) {
            result.add(emp);
        }
        return result;
    }

    //получить запись по id
    @Override
    public Employee getIdPerson(PhoneBook pB, int id) {
        return pB.getBook().get(id);
    }

    @Override
    public boolean updateEmployee(PhoneBook pB, int id, String fio) {
        if (fio.equals("")) return false;
            else
                pB.getBook().get(id).setFio(fio);
        return true;
    }

    @Override
    public boolean deleteEmplyeeId(PhoneBook pB, int id) {
        return pB.getBook().remove(id, pB.getBook().get(id));
    }
}
