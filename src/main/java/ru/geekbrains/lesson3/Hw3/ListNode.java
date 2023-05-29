package ru.geekbrains.lesson3.Hw3;

import ru.geekbrains.lesson3.example.LinkedList;


public class ListNode {
    private Node head;
    class Node {
        private int value;
        private Node next;
        Node() {}
        Node(int value) {
            this.value = value;
        }
        Node(int value, Node next) {
            this.value = value; this.next = next;
        }
    }
    public void addLast(int value) {
        Node temp = head;
        while (head != null && temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node();
        node.value = value;
        node.next = null;
        if (head!=null) {
//            node.previousNode = temp;
            temp.next = node;
        }else {
            head=node;
        }

    }
    public void reverse(){
        if (head!=null){
            if (head.next!=null){
                Node cur=head;
                Node prev=null;
                while (cur.next!=null){
                    Node temp = cur.next;
                    cur.next = prev;
                    prev = cur;
                    cur = temp;
                }
                head=cur;
                cur.next = prev;
            }
        }

    }

    @Override
    public String toString() {
        if (head!= null) {
            Node temp = head;
            String result = "";
            while (head != null && temp.next != null) {
                result += temp.value + "; ";
                temp = temp.next;
            }
            return result + temp.value;
        }
        return "Список пуст";
    }
}
//class Solution {
//    public ListNode reverseList(ListNode head) {
//
//    }
//}