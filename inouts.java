// import java.util.Arrays;
// import java.util.List;

public class inouts {
    
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n));
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
}
