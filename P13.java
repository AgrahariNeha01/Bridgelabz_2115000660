import java.util.*;

public class P13 {
    static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < N; i++) {
            String s = q.remove();
            result.add(s);
            q.add(s + "0");
            q.add(s + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(generateBinaryNumbers(N));
    }
}
