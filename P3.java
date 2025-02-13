import java.util.*;

class Stock_Span {
    public static int[] stock_Span(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }

            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return span;
    }
}

public class P3 {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] res = Stock_Span.stock_Span(prices);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
