package assignment_1;

public class SinglyLinkedList {

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node head;

    // Q5: Concatenate two lists
    public void concatenate(SinglyLinkedList list) {
        if (head == null) {
            head = list.head;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = list.head;
    }

    // Q6: Rotate right by k
    public void rotateRight(int k) {
        if (head == null) return;

        Node curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        curr.next = head;
        k %= len;
        for (int i = 0; i < len - k; i++)
            curr = curr.next;
        head = curr.next;
        curr.next = null;
    }

    // Q8 & Q9: Search and return index
    public int search(int value) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == value) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Q11: Remove at specific position
    public void removeAt(int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
    }
}
