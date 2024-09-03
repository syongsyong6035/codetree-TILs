import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] number = new int[10]; 
        for(int i=0;i<10;i++){
            number[i]=sc.nextInt();
            if(i==2 || i==4 || i==9){
                sum+=number[i];
            }
        }
        System.out.print(sum);
    }
}