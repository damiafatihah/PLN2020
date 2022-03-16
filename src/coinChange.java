import java.util.*;

public class coinChange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coins = {1, 5, 10, 25, 50};
        int t = scanner.nextInt();
        while(t-- > 0) {
            int amount = scanner.nextInt();;
            int total = change(amount, coins);
            System.out.println(total);
        }
    }

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int c : coins) {
            for(int i=c; i<=amount; i++) {
                dp[i] += dp[i-c];
            }
        }
        return dp[amount];
    }
}
