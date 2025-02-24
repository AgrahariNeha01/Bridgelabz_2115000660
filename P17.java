import java.lang.reflect.*;
import java.util.*;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

class P17 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String methodName = sc.next();
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();

        MathOperations obj = new MathOperations();
        Method m = MathOperations.class.getMethod(methodName, int.class, int.class);
        int result = (int) m.invoke(obj, a, b);
        
        System.out.println("Result: " + result);
    }
}
