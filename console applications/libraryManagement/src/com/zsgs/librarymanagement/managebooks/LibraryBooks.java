package com.zsgs.librarymanagement.managebooks;
import java.util.ArrayList;

public class LibraryBooks {
    ArrayList<String> bookNameList;
    ArrayList<String> authorNameList;
    ArrayList<Integer> bookIDList;
    public LibraryBooks(){
        bookNameList = new ArrayList<>();
        authorNameList = new ArrayList<>();
        bookIDList = new ArrayList<>();
    }

    public boolean add(String bookName , String authorName , int bookID){
        int bookIndex = bookIDList.indexOf(bookID);
        if(bookIndex != -1)
            return false;

        bookNameList.add(bookName);
        authorNameList.add(authorName);
        bookIDList.add(bookID);
        return true;
    }

    public boolean delete(int bookID){
        int bookIndex = bookIDList.indexOf(bookID);
        if(bookIndex == -1)
            return false;

        bookNameList.remove(bookIndex);
        authorNameList.remove(bookIndex);
        bookIDList.remove(bookIndex);
        return true;
    }

    public void view(){
        if(bookIDList.size() == 0){
            System.out.println("There are no books in library\n ------------------------");
            return;
        }
        System.out.println("Book\tAuthor\tBookID");
        for (int i = 0; i < bookIDList.size(); i++) {
            System.out.println(bookNameList.get(i) + "\t\t" + authorNameList.get(i) + "\t\t" + bookIDList.get(i));
        }
    }
}
