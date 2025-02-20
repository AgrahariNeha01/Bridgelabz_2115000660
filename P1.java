import java.util.*;

public class P1{
    static void Reverse( LinkedList<Integer> ll,int i ) {
      if(i>=ll.size())return ;
      int temp = ll.remove(i);
      Reverse(ll, i);
      ll.add(temp);
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        Reverse(ll, 0);
       System.out.println(ll);

        
    }

}