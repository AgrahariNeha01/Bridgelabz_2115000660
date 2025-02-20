import java.util.LinkedList;

public class P3 {
    static void rotatelist(LinkedList<Integer> ll, int k){
        int n= ll.size();
        k=k%n;
        int[] temp = new int[k];
        for(int i=0;i<k;i++)temp[i]=ll.get(i);
        for(int i=k;i<n;i++)ll.set(i-k,ll.get(i));
        for(int i=0;i<k;i++)ll.set(n-k+i,temp[i]);
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(); 
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        int k = 2; 
        rotatelist(ll,k);
        for(int i=0;i<ll.size();i++)
        {
            System.out.print(ll.get(i)+" ");
        }

    }
}
