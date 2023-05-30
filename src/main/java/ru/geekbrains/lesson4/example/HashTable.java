package ru.geekbrains.lesson4.example;

public class HashTable<K, V> {
    public   final Integer FISK_BASKET_SIZE = 16;
    public   Basket[] basketArray;

    public HashTable(Integer size) {

        this.basketArray = new Basket[size];
    }
//    public HashTable(Integer size) {
//
//        this.basketArray = (Basket[]) new Object[size];
//    }

//    public HashTable() {
//        this.basketArray = (Basket[]) new Object[16];
//    }

}
