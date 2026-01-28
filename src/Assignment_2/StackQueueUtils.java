package assignment_1;

import java.util.*;

public class StackQueueUtils {

    // Q1: Reverse string using stack
    public static String reverseString(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) st.push(c);
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }

    // Q2: Sort stack
    public static void sortStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int x = s.pop();
            while (!temp.isEmpty() && temp.peek() > x)
                s.push(temp.pop());
            temp.push(x);
        }
        while (!temp.isEmpty())
            s.push(temp.pop());
    }

    // Q3: Reverse queue
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) s.push(q.poll());
        while (!s.isEmpty()) q.add(s.pop());
    }

    // Q4: Priority Queue
    public static PriorityQueue<Integer> minPriorityQueue() {
        return new PriorityQueue<>();
    }

    // Q5: Merge two sorted queues
    public static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new LinkedList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() < q2.peek())
                result.add(q1.poll());
            else
                result.add(q2.poll());
        }
        result.addAll(q1);
        result.addAll(q2);
        return result;
    }
}
