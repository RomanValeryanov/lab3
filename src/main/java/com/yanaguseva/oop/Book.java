package com.yanaguseva.oop;

import java.util.ArrayList;
import java.util.List;

enum Edition {NEW, OLD}

public class Book {
    private String author;
    private String name;
    private String annotation;
    private Edition edition;
    private int year;
    private double price;
    private boolean isAvailable;
    private List<Session> sessions;

    public Book(String author, String name, Edition edition, int year, double price, String annotation) {
        this.author = author;
        this.name = name;
        this.edition = edition;
        this.year = year;
        this.price = price;
        this.annotation = annotation;
        this.isAvailable = true;
        this.sessions = new ArrayList<>();
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    @Override
    public String toString() {
        return "\nавтор: " + author + "\nназвание: " + name + "\nиздание: " + edition + "\nгод: " + year +
                "\nцена: " + price + "\nаннотация: " + annotation;
    }
}
