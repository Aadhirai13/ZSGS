package com.zsgs.librarymanagement.managebooks;

public class ManageBooksController {

    private ManageBooksView manageBooksView;
    private ManageBooksModel manageBooksModel;
    public ManageBooksController(ManageBooksView manageBooksView) {
        this.manageBooksView = manageBooksView;
        this.manageBooksModel = new ManageBooksModel(this);
    }
    public boolean addBook(String bookName, String authorName , int bookID){
        return manageBooksModel.addBook(bookName,authorName,bookID);
    }

    public boolean deleteBook(int bookID){
        return manageBooksModel.deleteBook(bookID);
    }

    public void viewBooks(){
        manageBooksModel.viewBooks();
    }
}
