package by.anykey.phoneBook.core;


import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public PhoneBook() {
    }

    private Map<Integer, Employee> book = new HashMap<>();

    public Map<Integer, Employee> getBook() {
        return book;
    }

    public void setBook(Map<Integer, Employee> book) {
        this.book = book;
    }
}