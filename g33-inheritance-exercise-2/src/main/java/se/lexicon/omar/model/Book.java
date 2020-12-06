package se.lexicon.omar.model;

import java.util.Date;

public class Book {

    private String title;
    private String author;
    private String category;
    private int year;
    private int pages;

    public Book(String title, String author, String category, int year, int pages) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.pages = pages;
    }


    public Book() {
        this.pages = 100;
    }

    public Book(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
