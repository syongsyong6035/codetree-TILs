import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String s = sc.nextLine();

        // Edge case: empty or single character string
        if (n == 0) {
            System.out.println(0);
            return;
        }

        // Initialize block count
        int blockCount = 1; // Start with 1 block
        
        // Count the number of contiguous blocks
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                blockCount++;
            }
        }

        // The minimum number of moves needed is the number of blocks minus 1
        // This is because if you have k blocks, you need (k-1) moves to merge them all into one.
        System.out.println((blockCount + 1) / 2);
    }
}