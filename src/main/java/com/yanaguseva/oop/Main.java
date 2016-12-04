package com.yanaguseva.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = initBooks();
        List<Reader> readers = initReaders();
        LibraryManager manager = new LibraryManager(books, readers);

        manager.giveBook(readers.get(0), books.get(0));
        manager.giveBook(readers.get(0), books.get(1));
        manager.giveBook(readers.get(1), books.get(2));
        manager.giveBook(readers.get(1), books.get(3));

        manager.printTakenBooks();
        manager.printReaderBooks(readers.get(0));

        manager.receiveBook(readers.get(0), books.get(0));
        manager.receiveBook(readers.get(1), books.get(2));
        manager.receiveBook(readers.get(1), books.get(3));
        manager.giveBook(readers.get(1), books.get(0));

        manager.printSession(books.get(0));
        manager.printSession(books.get(1));
        manager.printSession(books.get(2));
        manager.printSession(books.get(3));

        System.out.println("\nСамая популярная книга " + manager.getMostPopularBook());
    }

    private static List<Book> initBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Э.Ремарк", "На западном фронте без перемен", Edition.NEW, 1929, 800,
                "Эта книга не является ни обвинением, ни исповедью. " +
                        "Это только попытка рассказать о поколении, которое погубила война," +
                        " о тех, кто стал её жертвой, даже если спасся от снарядов."));
        books.add(new Book("Э.Войнич", "Овод", Edition.OLD, 1897, 659,
                "«Овод» — революционно-романтический роман, " +
                        "наиболее известный русскоязычному читателю труд английской," +
                        " позднее американской писательницы Этель Лилиан Войнич"));
        books.add(new Book("Д.Остин", "Гордость и предубеждение", Edition.OLD, 1813, 920,
                "«Гордость и предубеждение» — роман Джейн Остин, который увидел свет в 1813 году."));
        books.add(new Book("У.Голдинг", "Повелитель мух", Edition.NEW, 1954, 782,
                "«Повели́тель мух» — дебютный аллегорический роман английского писателя, " +
                        "лауреата Нобелевской премии по литературе, Уильяма Голдинга"));
        return books;
    }

    private static List<Reader> initReaders() {
        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader(1, "Иванов И.И", "Cпб., ул. Садовая 15-116", "564-09-98"));
        readers.add(new Reader(2, "Смиронов И.И", "Cпб., ул. Ленина 25-11", "574-19-48"));
        return readers;
    }
}
