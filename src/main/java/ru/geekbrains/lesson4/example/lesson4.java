package ru.geekbrains.lesson4.example;

public class lesson4 {
    public static void main(String[] args) {
        HashTable<Integer,Integer> hashTable=new HashTable<>(16);
        Basket basket = new Basket();

        Entity entity = new Entity();
        basket.add(entity,hashTable.basketArray);

    }
}
