package com.company.week3.Interfaces.Book;

public class BaseBooks implements Book{
    int numberOfPages;
    String author;
    String genre;
    protected BaseBooks (int numberOfPages, String author, String genre) {
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.genre = genre;
    }
    @Override
    public void open() {
        System.out.println("Book of " + this.author + " has opened.");
    }

    @Override
    public void close() {
        System.out.println("Book of " + this.author + " has closed.");
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
