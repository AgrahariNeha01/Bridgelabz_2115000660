import java.util.*;
public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height= sc.nextInt(); // in cm
        //1 cm = 100/254 inches while 1 inches 1/12 ;
        double inches = height*(100/254);
        double feet = inches/12;
        System.out.println("Your Height in cm is "+height+"while in feet is "+feet+" and inches is "+inches);
        sc.close();
    }
    
}
