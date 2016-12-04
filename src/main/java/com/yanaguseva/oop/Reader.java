package com.yanaguseva.oop;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private final int id;
    private String name;
    private String address;
    private String phone;
    private List<Book> bookList;

    public Reader(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.bookList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
        book.setAvailable(false);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
        book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "\nномер читательского билета: " + id + "\nимя: " + name +
                "\nадрес: " + address + "\nтелефон: " + phone;
    }
}
