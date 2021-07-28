package com.company.week3.Interfaces.Book;

public class eBook extends BaseBooks {
    double size;

    public eBook(int numberOfPages, String author, String genre, double size) {
        super(numberOfPages, author, genre);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void browsePages () {
        System.out.println("Browse pages.");
    }
}
