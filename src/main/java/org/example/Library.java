package org.example;

//import org.Book;
import java.util.HashMap;
import java.util.Objects;

public class Library {
    public HashMap<String, Book>  map;
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
    public String borrowBooks(String title){
        Book book=map.get(title);
        if(book.isBorrowed()){
           return "Book is Already Borrowed. Please check after some days.";
        }
        book.setBorrowed(true);
        return "Hurray ! Book Borrowed. Happy Reading.";
    }

}
