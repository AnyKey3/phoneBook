package by.anykey.phoneBook.core;

import java.util.List;

public interface funcPhoneBook {

    //Добавление сотрудника
    void addEmployee(Employee employee);

    //Получение списка всех записей
    List<Employee> getAllEmployee();

    //Получение  записи по id
    Employee getIdPerson(int id);

    //Редактирование записи по id
    boolean updateEmployee(Employee person, int id);

    //Удаление записи по id
    boolean deleteEmplyeeId(int id);

}
