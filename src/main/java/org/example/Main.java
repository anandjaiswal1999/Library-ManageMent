package org.example;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("Harry Potter" , "J.k. Rollings");
        Book book2 = new Book("Harry Potter and secret of salazar" , "J.k. Rollings");
        library.addBooks(book1);
        System.out.println(library.searchBooks("Harry1 Potter"));
        System.out.println(library.borrowBooks("Harry Potter"));
        System.out.println(library.borrowBooks("Harry Potter"));
    }
}