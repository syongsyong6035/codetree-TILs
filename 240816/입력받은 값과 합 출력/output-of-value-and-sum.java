import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a<1 || b<1 || a>100 || b>100){
            a = sc.nextInt();
            b = sc.nextInt();
        }
        System.out.printf("%d %d %d",a,b,(a+b));
        
        
    }
}