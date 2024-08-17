import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        while(b>a || a>1000){
            a = sc.nextInt();
            b = sc.nextInt();
        }
        double su = (a+b)/(a-b);
        
        System.out.printf(String.format("%.2f",su));
    }
}