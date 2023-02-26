package com.zsgs.librarymanagement.managebooks;

import java.util.ArrayList;

public class ManageBooksModel {

    private ManageBooksController manageBooksController;
    private LibraryBooks libraryBooks;
    public ManageBooksModel(ManageBooksController manageBooksController) {
        this.manageBooksController = manageBooksController;
        libraryBooks = new LibraryBooks();
    }

    public boolean addBook(String bookName, String authorName , int bookID){
        return libraryBooks.add(bookName , authorName , bookID);
    }

    public boolean deleteBook(int bookID){
        return libraryBooks.delete(bookID);
    }

    public void viewBooks(){
        libraryBooks.view();
    }
}
