package assignment_1;

import java.util.HashSet;

public class DoublyLinkedList {

    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    Node head;

    // Q12: Remove duplicates
    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Node curr = head;
        while (curr != null) {
            if (set.contains(curr.data)) {
                curr.prev.next = curr.next;
                if (curr.next != null)
                    curr.next.prev = curr.prev;
            } else {
                set.add(curr.data);
            }
            curr = curr.next;
        }
    }

    // Q13: Traverse reverse
    public void printReverse() {
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    // Q14: Search
    public boolean search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) return true;
            temp = temp.next;
        }
        return false;
    }
}
