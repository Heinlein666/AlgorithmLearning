package Stack;

public class MyStack {
    private Node first;
    private int size;

    public MyStack() {}

    public void push(String value) {
        if (first == null) {
            first = new Node();
            first.value = value;
        } else {
            Node oldFirst = first;
            first = new Node();
            first.value = value;
            first.next = oldFirst;
        }
        size++;
    }

    public String pop() {
        if (first == null) {
            return null;
        }
        String value = first.value;
        first = first.next;
        size--;
        return value;
    }

    public String peek() {
        if (first == null) {
            return null;
        }
        return first.value;
    }

    public int size() {
        return size;
    }

    private class Node {
        String value;
        Node next;
    }
}
