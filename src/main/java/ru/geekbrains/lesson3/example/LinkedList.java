package ru.geekbrains.lesson3.example;

public class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        private int value;
        private Node nextNode;
        private Node previousNode;
    }

    public Node findNode(int value) {
        Node node = head;
        while (node.nextNode != null) {
            if (node.value == value) {
                return node;
            }
            node = node.nextNode;
        }
        return null;
    }

    public Boolean findNodeBol(int value) {
        Node node = head;
        while (node.nextNode != null) {
            if (node.value == value) {
                return true;
            }
            node = node.nextNode;
        }
        return false;
    }

    public void addLast(int value) {
        Node temp = head;
        while (head != null && temp.nextNode != null) {
            temp = temp.nextNode;
        }
        Node node = new Node();
        node.value = value;
        node.nextNode = null;
        if (head!=null) {
            node.previousNode = temp;
            temp.nextNode = node;
        }else {
            head=node;
        }

    }
    public String toString(){
        Node temp = head;
        String result="";
        while (head != null && temp.nextNode != null) {
            result+=temp.value+"; ";
            temp = temp.nextNode;
        }
        return result+temp.value;
    }

    public void dellLast() {
        Node temp = head;
        if (temp != null) {
            if (temp.nextNode != null) {
                while (temp.nextNode.nextNode != null) {
                    temp = temp.nextNode;
                }
                temp.nextNode = null;
            } else {
                head = null;
            }
        }

    }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.nextNode = head;
        } else {
            tail = node;
        }
        node.previousNode = null;
        head = node;
    }

    public void dellFirst(int value) {
        if (head != null) {
            head = head.nextNode;
        }
        head.previousNode = null;
    }

    public void add(int value, Node previousNode) {
        Node node = new Node();
        node.value = value;
        Node nextNode = previousNode.nextNode;
        previousNode.nextNode = node;
        node.previousNode = previousNode;
        node.nextNode = nextNode;
        nextNode.previousNode = node;

    }

    public void revert() {
        Node node = head;
        Node temp = head;
        head = tail;
        tail = temp;
        while (node.nextNode != null) {
            temp = node.nextNode;
            node.nextNode = node.previousNode;
            node.previousNode = temp;
            node = node.previousNode;
        }
    }

    public void sort() {
        Node node = head;
        while (head != null && node.nextNode != null) {
            Node minPositionNode = node;
            Node innerNode = node.nextNode;
            while (innerNode != null) {
                if (innerNode.value < minPositionNode.value) {
                    minPositionNode = innerNode;
                }
                innerNode = innerNode.nextNode;
            }
            if (minPositionNode != node) {
                swap(node, minPositionNode);

                if (minPositionNode.previousNode == null) {
                    head = minPositionNode;
                }
                if (minPositionNode.nextNode == null) {
                    tail = minPositionNode;
                }
                node = minPositionNode.nextNode;
            } else {
                node = node.nextNode;
            }
        }

    }

    private void swap(Node node1, Node node2) {
        Node temp = node1.previousNode;
        node1.previousNode = node2.previousNode;
        node2.previousNode = temp;
        temp = node1.nextNode;
        node1.nextNode = node2.nextNode;
        node2.nextNode = temp;
        if (node1.previousNode != null) {
            node1.previousNode.nextNode = node1;
        }
        if (node1.nextNode != null) {
            node1.nextNode.previousNode = node1;
        }
        if (node2.previousNode != null) {
            node2.previousNode.nextNode = node2;
        }
        if (node2.nextNode != null) {
            node2.nextNode.previousNode = node2;
        }
    }

    //    public void push(int value) {
//        Node node = new Node();
//        node.value = value;
//        node.nextNode = head;
//        head = node;
//    }
//    public int pull(){
//        if (head==null){
//            throw new IllegalArgumentException("Stack is empty")
//        }
//        int result = head.value;
//        head = head.nextNode;
//        return result;
//    }
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.nextNode = head;
        head.previousNode = node;
        head = node;
    }

    public int pull() {
        if (head == null) {
            throw new IllegalArgumentException("Stack is empty");
        }
        int result = tail.value;
        tail = tail.previousNode;
        tail.nextNode = null;
        return result;
    }
}
