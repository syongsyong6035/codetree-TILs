import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a<1 || a>100){
            a = sc.nextInt();
        }
        a*=2;
        a+=3;
        System.out.print(a);

    }
}