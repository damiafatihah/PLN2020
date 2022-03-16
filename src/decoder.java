import java.util.*;

public class decoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0) {
            System.out.println();
            int count = 0;
            do {
                String s = scanner.nextLine();
                if(s.equals("")) break;
                int words = 0;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == ' ' || c == '\n') words++;
                    if (words + 1 > 30) {
                        System.out.println("Number of words exceeded");
                        break;
                    }
                }
                count++;
                decode(s);
            } while (count < 100);
        }
    }

    public static void decode(String s){
        String[] word = s.split(" ");
        String output = "";
        int j = 0;
        for(int i=0; i<word.length; i++) {
            if(word[i].length() < i + 1) i++;
            output += word[i].charAt(j);
            j++;
        }
        System.out.println(output);
    }
}
