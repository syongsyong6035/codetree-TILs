import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine(); // 입력 버퍼에 남아있는 개행 문자를 제거

        String b = sc.nextLine(); 
        int result;
        int su = b.replace("a","").length();

        if(a / 2 > su){
            if(!b.isEmpty() && b.charAt(0) == 'a'){  
                result = su - 1;
            } else {
                result = su;
            }
        } else {
            if(!b.isEmpty() && b.charAt(0) == 'a'){  
                result = a - su - 1;
            } else {
                result = a - su;
            }
        }

        System.out.println(result); 
    }
}