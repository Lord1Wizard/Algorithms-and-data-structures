package ru.geekbrains.lesson3.example;

import java.util.Random;

public class Sem_3 {
    private static final Random random = new Random();
    public static void main(String[] args) {
        LinkedList newList = new LinkedList();
        for (int i = 0; i < 1000; i++) {
            newList.addLast(i);
//            newList.addLast(random.nextInt(0, 100));
        }
        System.out.println(newList.toString());

    }
}
