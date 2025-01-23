import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A_amar = sc.nextInt();
        int H_amar = sc.nextInt();

        int A_akbar = sc.nextInt();
        int H_akbar = sc.nextInt();

        int A_anthony = sc.nextInt();
        int H_anthony = sc.nextInt();

        int youngestAge = Math.min(A_amar, Math.min(A_akbar, A_anthony));
        String youngestFriend = "";

        if (youngestAge == A_amar) {
            youngestFriend = "Amar";
        } else if (youngestAge == A_akbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        int tallestHeight = Math.max(H_amar, Math.max(H_akbar, H_anthony));
        String tallestFriend = "";

        if (tallestHeight == H_amar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == H_akbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
        
        sc.close();
    }
}
