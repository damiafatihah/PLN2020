import java.util.*;
import java.math.*;

public class eid {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            BigInteger x = new BigInteger("1"); // Initialize
            BigInteger y = new BigInteger("1");
            long a = scanner.nextLong();
            x = BigInteger.valueOf(a);
            n--;
            while(n-- > 0) {
                long b = scanner.nextLong();
                y = BigInteger.valueOf(b);
                x = (x.multiply(y)).divide(x.gcd(y)); // LCM(a,b) = (a * b)/GCD(a, b)
            }
            System.out.println(x);
        }
    }
    /*
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static long lcm(long arr[]) {
        long result = arr[0];
        for (int i=1; i<arr.length; i++) {
            result = (result * arr[i]) / gcd(result, arr[i]);
        }
        return result;
    }
    */
}
