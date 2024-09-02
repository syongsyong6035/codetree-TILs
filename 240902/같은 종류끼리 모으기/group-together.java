import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        sc.nextLine(); // 입력 버퍼에 남아있는 개행 문자를 제거

        String b = sc.nextLine(); 
        double result;
        double su = b.replace("a", "").length();
        double num = 1;
     
        if (a / 2 > su) {
            if (!b.isEmpty() && b.charAt(0) == 'a') {  
             
                for (int i = 0; i < su; i++) {
                    if (b.charAt(i) == 'b') {
                        break;
                    }
                    else if (b.charAt(i) == 'a') {
                        ++num;
                    }
                }
                result = su - num;
            } else {
                result = su;
            }
        } else {
            if (!b.isEmpty() && b.charAt(0) == 'b') {  
                for (int i = 0; i < su; i++) {
                    if (b.charAt(i) == 'a') {
                        break;
                    }
                    else if (b.charAt(i) == 'b') {
                        ++num;
                    }
                }
                result = a - su - num;
            } else {
                result = a - su;
            }
        }

        System.out.println(result); 
    }
}