package org.example;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Users users = new Users();
        User user = new User("1","Anand");
        User user1 = new User("2","Aman");
        users.addUser(user1);
        users.addUser(user);
        library.setUsers(users);
        Book book1 = new Book("Harry Potter" , "J.k. Rollings");
        Book book2 = new Book("Harry Potter and secret of salazar" , "J.k. Rollings");
        library.addBooks(book1);
        System.out.println(library.searchBooks("Harry1 Potter"));
        System.out.println(library.borrowBooks(user.getUserId(),"Harry Potter"));
    }
}