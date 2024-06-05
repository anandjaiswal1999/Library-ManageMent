package org.example;

//import org.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Library {
    public HashMap<String, Book>  map;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    Users users;
    public Library(){
        this.map=new HashMap<>();
    }
    public void addBooks(Book book){
        map.put(book.getTitle(),book);
    }
    public Book searchBooks (String requestTitle){
        Book book= map.get(requestTitle);
        if(Objects.nonNull(book)){
            return book;
        }else{
            book= new Book();
            book.setErrMsg("The book you are searching for is not present in the store");
            return book;
        }
    }
    public String borrowBooks(String userID,String title){
        User user = users.map1.get(userID);

        Book book=map.get(title);
        if(book.isBorrowed()){
           return "Book is Already Borrowed. Please check after some days.";
        }
        if(user.getBorrowedBooks()==null){
            user.setBorrowedBooks(new ArrayList<>());
        }
        user.getBorrowedBooks().add(book);
        book.setBorrowed(true);
        return "Hurray ! Book Borrowed. Happy Reading.";
    }

}
