package ru.geekbrains.lesson4.example;

public class Basket {
    public Node head;

    private class Node {
        private Entity value;
        private Node next;
    }
    public Boolean add(Entity entity, Basket[] basketArray) {
        if (basketArray[calculateIndex(entity.getKey(),basketArray)] != null) {
            return false;
        }
        Basket.Node current = head;
        Node node = new Node();
        node.value = entity;
        while (current.next != null) {
            current = current.next;
        }
        current.next= node;
        return true;
    }
    private  Integer calculateIndex(Object key,  Basket[] basketArray) {
        return key.hashCode() % basketArray.length;
    }
    private Object get(Object key,  Basket[] basketArray) {
        if (basketArray[calculateIndex(key,basketArray)] != null) {
            return basketArray[calculateIndex(key, basketArray)];
        }
        return null;
    }
}
