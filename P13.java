import java.util.*;
public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans= true;
        if(n%5==0)System.out.println("Is the number "+n+" divisible by 5? "+ans);
        else {
                ans=false;
            System.out.println("Is the number "+n+" divisible by 5? "+ans);}
            sc.close();
    }
}
