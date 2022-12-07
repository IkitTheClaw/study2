package Unit14.LinkedList2;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        Node x = first;
        for (int i = 0; i <= index; i++) {
            x = x.next;
            if (x == null) {
                return null;
            }
        }
        return x.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
