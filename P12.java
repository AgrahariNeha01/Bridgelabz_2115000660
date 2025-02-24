import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

class P12 {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int expensiveCalculation(int n) {
        if (cache.containsKey(n)) {
            System.out.println("Returning cached result for " + n);
            return cache.get(n);
        }
        int result = n * n; 
        cache.put(n, result);
        System.out.println("Computed result for " + n);
        return result;
    }

    public static void main(String[] args) throws Exception {
        P12 obj = new P12();
        System.out.println(obj.expensiveCalculation(5));
        System.out.println(obj.expensiveCalculation(5)); 
        System.out.println(obj.expensiveCalculation(10));
        System.out.println(obj.expensiveCalculation(10)); 
    }
}
