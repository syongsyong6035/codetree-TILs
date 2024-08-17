import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String num[] = number.split("-");
   
        System.out.printf("%s-%s-%s",num[0],num[2],num[1]);
        
    }
}