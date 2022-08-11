package by.anykey.phoneBook.core;

public class Employee {

    public Employee(){
    }

    public Employee(String fio, String title, String department) {
        this.id = id;
        this.fio = fio;
        this.title = title;
        this.department = department;
    }

    public Employee(int id, String fio, String title, String department, char businessPhone, char personalPhone) {
        this.id = id;
        this.fio = fio;
        this.title = title;
        this.department = department;
        this.businessPhone = businessPhone;
        this.personalPhone = personalPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String fio;
    private String title;
    private String department;
    private char businessPhone;
    private char personalPhone;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public char getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(char businessPhone) {
        this.businessPhone = businessPhone;
    }

    public char getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(char personalPhone) {
        this.personalPhone = personalPhone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                "fio='" + fio + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", businessPhone=" + businessPhone +
                ", personalPhone=" + personalPhone +
                '}';
    }
}
