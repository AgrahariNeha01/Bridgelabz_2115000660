import java.util.*;

class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String s[] = new String[n];
        for (int i = 0; i < n; i++) s[i] = sc.nextLine();
        String w = sc.nextLine();
        System.out.println(findWord(s, w));
    }

    static String findWord(String[] s, String w) {
        for (String st : s) 
            if (st.contains(w)) return st;
        return "Not Found";
    }
}
