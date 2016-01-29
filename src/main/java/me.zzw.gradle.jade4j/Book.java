package me.zzw.gradle.jade4j;

/**
 * Created by infosea on 2016/1/29.
 */
public class Book {
    public String name;
    public double price;
    public boolean available;

    public Book(String name, double price, boolean isNot) {
        this.name = name;
        this.price = price;
        this.available = isNot;
    }
}
