import java.util.*;

class P15 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q1.add(x);
    }

    int pop() {
        if (q1.isEmpty()) return -1;
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int top = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    int top() {
        if (q1.isEmpty()) return -1;
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int top = q1.peek();
        q2.add(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    public static void main(String[] args) {
        P15 stack = new P15();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // Output: 3
    }
}
