package org.example;

public class LL {
static class Node{
    Node next;
    int data;

    Node(int data){
        this.data = data;
    }

}
    public static void main(String[] args) {
        Node h = new Node(1);
        Node h1 = new Node(2);
        h.next = h1;
        System.out.println(h.next.data);


    }
}
