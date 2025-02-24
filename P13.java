import java.lang.reflect.*;
import java.util.Scanner;

class P13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String className = sc.next();
        sc.close();

        Class<?> cls = Class.forName(className);

        System.out.println("Methods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m);
        }

        System.out.println("\nFields:");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println(f);
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> c : cls.getDeclaredConstructors()) {
            System.out.println(c);
        }
    }
}
