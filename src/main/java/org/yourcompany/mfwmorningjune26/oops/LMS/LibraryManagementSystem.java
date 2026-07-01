package org.yourcompany.mfwmorningjune26.oops.LMS;

import java.util.ArrayList;
import java.util.List;

class LibraryManagementSystem {
    private List<User> registeredUsers = new ArrayList<>();
    private List<Book> bookInventory   = new ArrayList<>();

    public void registerUser(User user) { registeredUsers.add(user); }
    public void addBook(Book book)      { bookInventory.add(book); }

    public boolean lendBook(Member member, Book book) {
        // 1. delegate to book.lend(member)
        // 2. if successful, call member.incrementBorrowCount()
        // 3. return the result
        return true;
    }

    public void returnBook(Member member, Book book) {
        // 1. delegate to book.returnItem(member)
        // 2. call member.decrementBorrowCount()
    }

    public List<Book> searchBooks(String criteria) {
        // loop over bookInventory, match by title or author
        return new ArrayList<>();
    }

    public List<Book> searchBooks(String criteria, String type) {
        // loop over bookInventory, match by criteria AND book type
        return new ArrayList<>();
    }

    public void displayAllBooks() {
        // call displayBookDetails() on each book
    }

    public void displayRegisteredUsers() {
        // call displayDashboard() on each user
    }
}
