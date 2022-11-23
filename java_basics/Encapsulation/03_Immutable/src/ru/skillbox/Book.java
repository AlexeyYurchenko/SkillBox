package ru.skillbox;

public class Book {
    private final String name;
    private final String author;
    private final int numberPages;
    private final int isbnNumber;

    public Book(String name, String author, int numberPages, int isbnNumber){
        this.name=name;
        this.author=author;
        this.numberPages=numberPages;
        this.isbnNumber=isbnNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }
}
