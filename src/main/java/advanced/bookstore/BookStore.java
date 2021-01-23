package advanced.bookstore;

import advanced.collections.Genre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BookStore {
    private ArrayList<Book> sortedByYear;
    private ArrayList<Student> boughtOrBorrowedBooks;


    public BookStore() {
    }

    public BookStore(ArrayList<Book> sortedByYear, ArrayList<Student> boughtOrBorrowedBooks) {
        this.sortedByYear = sortedByYear;
        this.boughtOrBorrowedBooks = boughtOrBorrowedBooks;

    }

    public ArrayList<Book> getSortedByYear() {
        return sortedByYear;
    }

    public void setSortedByYear(ArrayList<Book> sortedByYear) {
        this.sortedByYear = sortedByYear;
    }

    public ArrayList<Student> getBoughtOrBorrowedBooks() {
        return boughtOrBorrowedBooks;
    }

    public void setBoughtOrBorrowedBooks(ArrayList<Student> boughtOrBorrowedBooks) {
        this.boughtOrBorrowedBooks = boughtOrBorrowedBooks;
    }
    private void initWithDefaultBooks() {

    }
}
