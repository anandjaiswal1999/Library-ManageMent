package org.example;

import java.util.List;

public class User {
    String name;
    String userId;
    public User (String userId , String name){
        this.userId=userId;
        this.name=name;
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    List<Book> borrowedBooks;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


}
