package ru.geekbrains.lesson3.Hw3;

import ru.geekbrains.lesson3.example.LinkedList;
import java.util.Random;

public class Hw3 {
    private static final Random random = new Random();
    public static void main(String[] args) {
        ListNode newList = new ListNode();
        for (int i = 0; i < 10; i++) {
            newList.addLast(random.nextInt(0, 100));
        }
        System.out.println(newList.toString());
        newList.reverse();
        System.out.println(newList.toString());
    }
}
