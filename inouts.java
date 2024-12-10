// import java.util.Arrays;
// import java.util.List;

import java.util.stream.IntStream;
//fibbo
public class inouts {
    public static void main(String[] args) {
        int n = 20;
        // System.out.println(isPrime(n));
        stream().limit(n).forEachOrdered(System.out::println);
    }
    
    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i < n; i++ ) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    private static int last = 0;
    private static int next = 1;
            public static IntStream stream() {
                return IntStream.generate(() -> {
                    int oldLast = last;
                    last = next;
            next = oldLast + next;
            return oldLast;
        });
    }
}