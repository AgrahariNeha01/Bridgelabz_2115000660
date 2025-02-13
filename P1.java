import java.util.*;

class QueueUsingStacks<T> {
    private Stack<T> s1;
    private Stack<T> s2;

    public QueueUsingStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(T data) {
        s1.push(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null; 
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public T peek() {
        if (isEmpty()) {
            return null; 
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public int size() {
        return s1.size() + s2.size();
    }
}

public class P1{
    public static void main(String[] args) {
        QueueUsingStacks<Integer> q = new QueueUsingStacks<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); 
        System.out.println(q.peek());    
        System.out.println(q.size());    

        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}
