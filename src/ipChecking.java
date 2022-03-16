import java.util.*;

public class ipChecking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count = 0;
        scanner.nextLine();
        while(t-- > 0) {
            String d = scanner.nextLine();
            String b = scanner.nextLine();
            String[] ds = d.split("\\.");
            String[] bs = b.split("\\.");
            int[] decimal = new int[ds.length];
            int[] binary = new int[bs.length];
            for(int i=0; i<decimal.length; i++) decimal[i] = Integer.parseInt(ds[i]);
            for(int j=0; j<binary.length; j++) binary[j] = Integer.parseInt(bs[j]);

            if(check(decimal, binary)) System.out.printf("Case %d: Yes", ++count);
            else System.out.printf("Case %d: No", ++count);
            scanner.nextLine();
        }
    }

    public static boolean check(int[] decimal, int[] binary) {
        for(int i=0; i<binary.length; i++) {
            int convert = convertBinaryToDecimal(binary[i]);
            if(convert != decimal[i]) return false;
        }
        return true;
    }

    public static int convertBinaryToDecimal(int num) {
        int decimalNumber = 0, r, i = 0;
        while (num != 0) {
            r = num % 10;
            decimalNumber += r * Math.pow(2, i);
            num /= 10;
            i++;
        }
        return decimalNumber;
    }
}
