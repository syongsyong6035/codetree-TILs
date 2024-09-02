import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String s = sc.nextLine();

        int blockCount = 1;

 
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                blockCount++;
            }
        }

       
        int minMoves = blockCount / 2;

        System.out.println(minMoves);
    }
}