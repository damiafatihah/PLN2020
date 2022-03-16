import java.util.*;

public class triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            triangleType(a, b, c);
        }
    }

    public static void triangleType(int a, int b, int c) {
        if(a >= (b+c) || c >= (b+a) || b >= (a+c)) System.out.println("Invalid");
        else if(a == b && b == c) System.out.println("Equilateral Triangle");
        else if((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) System.out.println("Isosceles Triangle");
        else System.out.println("Scalene Triangle");
    }
}
