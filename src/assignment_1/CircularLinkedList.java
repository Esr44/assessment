package assignment_1;

public class CircularLinkedList {

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node head;

    // Q15: Insert at position
    public void insertAt(int pos, int value) {
        Node newNode = new Node(value);
        if (pos == 0) {
            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Q16: Delete at position
    public void deleteAt(int pos) {
        if (pos == 0) {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = head.next;
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
    }

    // Q17: Search
    public boolean search(int value) {
        Node temp = head;
        do {
            if (temp.data == value) return true;
            temp = temp.next;
        } while (temp != head);
        return false;
    }
}
