import java.util.*;
public class P4 {
    static List<Integer> removeduplicate(List<Integer> ll)
    {
        Set<Integer> st = new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(Integer ele :ll){
            if(!st.contains(ele)){
                st.add(ele);
                l.add(ele);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(3);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(2);
        ll.add(4);
        List<Integer> res=removeduplicate(ll);
        System.out.println(res);


        
    }
}
