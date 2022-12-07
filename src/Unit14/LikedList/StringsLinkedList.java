package Unit14.LikedList;

import java.util.LinkedList;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        final Node temp = last;
        final Node newNode = new Node();
        newNode.prev = temp;
        newNode.value = value;
        last = newNode;
        if (temp == null) {
            first = newNode;
        } else {
            temp.next = newNode;
        }
    }
    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}


