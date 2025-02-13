import java.util.*;

class Stack_Sorter {
    public static void sort_Stack(Stack<Integer> st) {
        if (st.size() <= 1) return;

        int top = st.pop();
        sort_Stack(st);
        insert_Sorted(st, top);
    }

    private static void insert_Sorted(Stack<Integer> st, int val) {
        if (st.isEmpty() || st.peek() <= val) {
            st.push(val);
            return;
        }

        int top = st.pop();
        insert_Sorted(st, val);
        st.push(top);
    }
}

public class P2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);
        st.push(5);

        Stack_Sorter.sort_Stack(st);

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
