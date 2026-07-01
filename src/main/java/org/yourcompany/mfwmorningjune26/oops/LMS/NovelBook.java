package org.yourcompany.mfwmorningjune26.oops.LMS;

class NovelBook extends Book {
    private final String genre; // no setter..

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook | Title: " + getTitle()
            + " | Author: " + getAuthor()
            + " | Genre: " + genre);
    }
}
