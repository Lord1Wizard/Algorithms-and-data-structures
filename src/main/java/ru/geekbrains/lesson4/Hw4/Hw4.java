package ru.geekbrains.lesson4.Hw4;

import java.util.Random;

public class Hw4 {
    private static final Random random = new Random();
    public static void main(String[] args) {

        final  RedBlackTree tree = new RedBlackTree();
        for (int i = 0; i < 5; i++) {
            tree.add(i);
        }
        tree.print();

    }
}
