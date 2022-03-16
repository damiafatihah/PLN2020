import java.util.*;

public class guessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int n1 = 3 * n;
            int n2 = 0;
            if(n1 % 2 == 0) n2 = n1 / 2;
            else n2 = (n1 + 1) / 2;
            int n3 = 3 * n2;
            int n4 = n3 / 9;
            int nGuess = 0;
            if(n1 % 2 == 0) nGuess = 2 * n4;
            else nGuess = 2 * n4 + 1;
            if(nGuess % 2 == 0) System.out.printf("even %d", n4);
            else System.out.printf("odd %d", n4);
            System.out.println();
        }
    }
}
