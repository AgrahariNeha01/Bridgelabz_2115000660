import java.util.*;
public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        boolean ans=false;
        if(n1>n2 && n1>n3){
            ans=true;
            System.out.println("Is the first number the largest? "+ans);
        }
        else if(n2>n1 && n2>n3) {
            ans=true; 
            System.out.println("Is the second number the largest?"+ans);
        }
        else if(n3>n1 && n3>n2)
        {
            ans=true; 
            System.out.println("Is the third number the largest?"+ans);
            
        }
        else System.out.println("No");
        sc.close();
    }
    }
    

