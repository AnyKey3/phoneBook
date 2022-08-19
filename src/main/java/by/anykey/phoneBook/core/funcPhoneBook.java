package by.anykey.phoneBook.core;

import java.util.List;

public interface funcPhoneBook {

    //Добавление сотрудника


    void addEmployee(PhoneBook pB, Employee employee);

    //Получение списка всех записей
    List<Employee> getAllEmployee(PhoneBook pB);

    //Получение  записи по id
    Employee getIdPerson(PhoneBook pB, int id);

    //Редактирование записи по id
    boolean updateEmployee(PhoneBook pB, int id, String fio);

    //Удаление записи по id
    boolean deleteEmplyeeId(PhoneBook pB, int id);

}
