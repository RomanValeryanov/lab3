package com.yanaguseva.oop;

import java.util.Date;
import java.util.List;

public class LibraryManager {
    private List<Book> bookList;

    public LibraryManager(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void giveBook(Reader reader, Book book) {
        if (book.isAvailable()) {
            reader.addBook(book);
            book.addSession(new Session(reader, new Date()));
        } else {
            System.out.println("Книга не может быть выдана");
        }
    }

    public void receiveBook(Reader reader, Book book) {
        reader.removeBook(book);
        List<Session> bookSessions = book.getSessions();
        bookSessions.get(bookSessions.size() - 1).setEndDate(new Date());
    }

    public void printTakenBooks() {
        System.out.println("Взятые книги: ");
        for (Book book : bookList) {
            if (!book.isAvailable()) {
                System.out.println("\t" + book.getName());
            }
        }
    }

    public void printReaderBooks(Reader reader) {
        System.out.println("Книги у читателя: " + reader.getName());
        for(Book book : reader.getBookList()) {
            System.out.println("\t" + book.getName());
        }
    }

    public void printSession(Book book) {
        System.out.print("\nЧитатели, которые брали книгу: " + book.getName());
        for (Session session : book.getSessions()) {
            System.out.println(session.getReader() + "\nдата выдачи: " + session.getStartDate() +
            "\nдата возврата: " + (session.getEndDate() == null ? "не вернул" : session.getEndDate()));
        }
    }

    public Book getMostPopularBook() {
        Book popularBook = bookList.get(0);
        for (Book book : bookList) {
            if (book.getSessions().size() > popularBook.getSessions().size()) {
                popularBook = book;
            }
        }
        return popularBook;
    }
}
