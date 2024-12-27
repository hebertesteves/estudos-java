import java.util.Scanner;


public class uri1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int ab = (a + b + Math.abs(a - b)) / 2;
        int ac = (ab + c + Math.abs(ab - c)) / 2;
        
        System.out.printf("%d eh o maior%n", ac);
        
        sc.close();
        
    }
}
