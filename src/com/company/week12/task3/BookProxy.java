package com.company.week12.task3;

public class BookProxy extends Book {
    private boolean flag = false;

    public BookProxy(String title, String author) {
        super(title, author);
    }
    public boolean isLoaded () {
        return flag;
    }
    public void Load () {
        if (flag) {
            throw new RuntimeException("book is already loaded");
        }
        flag = true;
    }

    @Override
    public String getTitle() {
        if(!isLoaded()) {
            throw new RuntimeException("The book is not loaded");
        }
        return super.getTitle();
    }

    @Override
    public String getAuthor() {
        if(!isLoaded()) {
            throw new RuntimeException("The book is not loaded");
        }
        return super.getAuthor();
    }
}
