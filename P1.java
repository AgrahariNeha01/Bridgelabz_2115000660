import java.util.*;

class P1 {
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);

    static int getGuess(int l, int h) {
        return r.nextInt(h - l + 1) + l;
    }

    static String getFeedback(int g) {
        System.out.println("Is it " + g + "? (h/l/c)");
        return sc.next();
    }

    public static void main(String[] args) {
        int l = 1, h = 100, g;
        String f;

        System.out.println("Think of a number between 1 and 100.");

        do {
            g = getGuess(l, h);
            f = getFeedback(g);

            if (f.equals("h")) h = g - 1;
            else if (f.equals("l")) l = g + 1;
        } while (!f.equals("c"));

        System.out.println("Yay! Computer guessed it.");
    }
}
