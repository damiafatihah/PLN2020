import java.util.*;

public class decrypt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String s = scanner.nextLine();
            int n = s.length();
            if(n % 2 != 0) {
                System.out.println("Length must be even");
                break;
            }
            char[] c = s.toCharArray();
            int sum1 = 0, sum2 = 0;
            char[] a1 = new char[n/2];
            char[] a2 = new char[n/2];
            int[] shift = new int[n/2];
            char[] a = new char[n/2];
            for(int i=0; i<n/2; i++) sum1 += Character.toUpperCase(c[i]) - 'A';
            for(int i=n/2; i<n; i++) sum2 += Character.toUpperCase(c[i]) - 'A';
            for(int i=0; i<n/2; i++) a1[i] = (char)('A' + (((Character.toUpperCase(c[i]) - 'A') + sum1) % 26));
            for(int i=0; i<n/2; i++) a2[i] = (char)('A' + (((Character.toUpperCase(c[i+(n/2)]) - 'A') + sum2) % 26));
            for(int i=0; i<n/2; i++) shift[i] = Character.toUpperCase(a2[i]) - 'A';
            for(int i=0; i<n/2; i++) a[i] = (char)('A' + (((a1[i] - 'A')+ shift[i]) % 26));
            String output = "";
            for(int i=0; i<n/2; i++) output += a[i];
            System.out.println(output);
        }
    }
}
