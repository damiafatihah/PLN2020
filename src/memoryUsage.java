import java.util.*;

public class memoryUsage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[ \n]");

        int numberProcess = Integer.parseInt(scanner.next());
        int numberQuery = Integer.parseInt(scanner.next());
        int[] list = new int[numberProcess * 3];
        int j = 0;

        for(int i=0; i<numberProcess; i++){
            list[j++] = Integer.parseInt(scanner.next());
            list[j++] = Integer.parseInt(scanner.next());
            list[j++] = Integer.parseInt(scanner.next());
        }

        int[] pidInput = new int[numberQuery];
        int[] memoryTotal = new int[numberQuery];

        for(int i=0; i<numberQuery; i++){
            pidInput[i] = Integer.parseInt(scanner.next());
            memoryTotal[i] = calculateMemory(pidInput[i], list);
        }

        for(int i=0; i<numberQuery; i++) System.out.println("" + memoryTotal[i]);
    }
    public static int calculateMemory(int pidInput, int[] list){
        int totalMemory = 0;
        for(int i=0 ; i<list.length/3; i++){
            if (list[i*3] == pidInput)
                totalMemory += list[i*3+2];
            else
                continue;
            for(int j=0 ; j<list.length/3; j++){
                if(list[i*3] == list[j*3+1]){
                    totalMemory += calculateMemory(list[j*3], list);
                }
            }
        }
        return totalMemory;
    }
}
