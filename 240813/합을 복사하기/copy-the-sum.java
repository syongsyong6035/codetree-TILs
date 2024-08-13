public class Main {
    public static void main(String[] args) {
        int a = 1,b = 2,c = 3,d;
        d = a+b+c;
        a=d;
        b=d;
        c=d;
    
        System.out.printf("%d %d %d",a,b,c);
       

    }
}