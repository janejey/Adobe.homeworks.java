package com.company.week12.task3;

public class Main {
    public static void main(String[] args) {
        BookProxy bookProxy = new BookProxy("aaa", "bbb");
        System.out.println(bookProxy.isLoaded());
        bookProxy.Load();
        System.out.println(bookProxy.isLoaded());
        System.out.println(bookProxy.getAuthor());
        System.out.println(bookProxy.getTitle());
        bookProxy.Load();
    }
}