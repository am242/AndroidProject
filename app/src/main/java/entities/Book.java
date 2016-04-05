package entities;

import java.io.Serializable;

/**
 * Created by am2
 */
public class Book implements Serializable {

    private BookCategory bookCategory;
    private long bookId;
    private String bookName;
    private String authorName;
    public static int bookCounter = 2000;

    // CTORS
    public Book(String authorName, BookCategory bookCategory, String bookName) {
        this.authorName = authorName;
        this.bookCategory = bookCategory;
        this.setBookId();
        this.bookName = bookName;
    }
    public Book() {
        this.authorName = "";
        this.bookCategory = null;
        this.bookId = 0;
        this.bookName = "";
    }

    // Getters & Setters
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }
    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public static int getBookCounter() {
        return bookCounter;
    }
    public static void setBookCounter(int bookCounter) {
        Book.bookCounter = bookCounter;
    }

    public long getBookId() {
        return bookId;
    }
    public void setBookId() { this.bookId = bookCounter++;}

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // ToString methoed
    @Override
    public String toString() {
        return "Entities.Book{" +
                "authorName='" + authorName + '\'' +
                ", bookCategory=" + bookCategory +
                ", bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
    // Equals methoed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (bookId != book.bookId) return false;
        if (bookCategory != book.bookCategory) return false;
        if (!bookName.equals(book.bookName)) return false;
        return authorName.equals(book.authorName);

    }
}