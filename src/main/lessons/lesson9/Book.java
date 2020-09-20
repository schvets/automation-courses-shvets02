package main.lessons.lesson9;

import java.util.Objects;
import java.util.UUID;

public class Book {

    private String id = "default ID";
    private String title = "default title";;
    private Author author;
    private String year= "default year";
    private String decsription = "default decsription";
    private String isbn = "default isbn";


    public Book(String id, String title, Author author, String year, String decsription, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.decsription = decsription;
        this.isbn = isbn;
    }

    public Book(String title, Author author, String year) {
        this.id = UUID.randomUUID().toString();
        this.decsription = "";
        this.isbn = "";
        new Book(id, title, author, year,  decsription, isbn);
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isIsbnValid(isbn)){
            this.isbn = isbn;
        }
    }

    private boolean isIsbnValid(String isbn) {
        // check valid isbn
        return  false;
    }


    public String toString() {
        return "5";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(year, book.year) &&
                Objects.equals(decsription, book.decsription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, decsription);
    }
}
