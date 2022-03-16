import java.util.*;

public class T9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sequence = {"2", "22", "222",
                             "3", "33", "333",
                             "4", "44", "444",
                             "5", "55", "555",
                             "6", "66", "666",
                             "7", "77", "777", "7777",
                             "8", "88", "888",
                             "9", "99", "999", "9999"};
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(convertLetters(sequence, s));
        }
    }

    public static String convertLetters(String[] sequence, String s) {
        String keypad = "";
        int index;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                keypad += "0";
            }
            else {
                index = Character.toUpperCase(s.charAt(i)) - 'A';
                keypad += sequence[index];
            }
        }
        return keypad;
    }
}
