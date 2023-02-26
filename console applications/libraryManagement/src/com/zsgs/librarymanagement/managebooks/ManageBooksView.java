package com.zsgs.librarymanagement.managebooks;

import java.util.Scanner;

public class ManageBooksView {

    private Scanner scanner = new Scanner(System.in);
    private ManageBooksController manageBooksController;

    public ManageBooksView() {
        manageBooksController = new ManageBooksController(this);
    }

    public void showManageBooksView(){
        outer:
        while(true){
            System.out.println("Press 1 to Add new books\nPress 2 to Remove books\nPress 3 to View book lists\nPress 4 to Exit\n ------------------------");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                {
                    System.out.println("Enter Book Name to add");
                    String bookName = scanner.next();
                    System.out.println("Enter Author Name of book - " + bookName + " - ");
                    String authorName = scanner.next();
                    System.out.println("Enter Book ID of book - " + bookName + " - ");
                    int bookID = scanner.nextInt();
                    if(manageBooksController.addBook(bookName, authorName, bookID))
                        System.out.println("Book added successfully\n ------------------------");
                    else
                        System.out.println("BookID is already in the library\n ------------------------");
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Book ID to delete");
                    int bookID = scanner.nextInt();
                    if(manageBooksController.deleteBook(bookID))
                        System.out.println("Book removed successfully\n ------------------------");
                    else
                        System.out.println("Given BookID is not available to remove\n ------------------------");
                    break;
                }
                case 3:
                {
                    manageBooksController.viewBooks();
                    break;
                }
                case 4:
                {
                    break outer;
                }
            }
        }

    }
}
