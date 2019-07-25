package classes.optionalTask;

import java.util.Arrays;

public class Book {

    private int id;
    private String name;
    private String[] authors;
    private String publisher;
    private int publishYear;
    private int numberOfPages;
    private double price;
    private String cover;

    public Book(int id, String name, String[] authors, String publisher, int publishYear, int numberOfPages, double price) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.cover = "soft";
    }

    public Book(int id, String name, int publishYear, int numberOfPages, double price) {
        this.id = id;
        this.name = name;
        this.publishYear = publishYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.authors = new String[]{"Andrzej Sapkowski"};
        this.publisher = "superNOWA";
        this.cover = "hard";
    }

    public Book(int id, String name, String publisher, int publishYear, int numberOfPages, double price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.cover = "hard";
        this.authors = new String[]{"Christie Golden"};
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getCover() {
        return cover;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return
                " id=" + id + ", name='" + name + '\'' +
                        ", author=" + Arrays.toString(authors) +
                        ", publisher='" + publisher + '\'' +
                        ", publishYear=" + publishYear +
                        ", numberOfPages=" + numberOfPages +
                        ", price=" + price +
                        ", cover='" + cover + '\'';
    }
}

