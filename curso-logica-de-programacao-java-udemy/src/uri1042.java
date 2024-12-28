import java.util.Scanner;

public class uri1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c , n1, n2, n3;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a > b && a > c) {
            n1 = a;
            if (b > c) {
                n2 = b;
                n3 = c;
            } else {
                n2 = c;
                n3 = b;
            }
        } else if (b > a && b > c) {
            n1 = b;
            if (a > c) {
                n2 = a;
                n3 = c;
            } else {
                n2 = c;
                n3 = a;
            }
        } else {
            n1 = c;
            if (a > b) {
                n2 = a;
                n3 = b;
            } else {
                n2 = b;
                n3 = a;
            }
        }
        
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        sc.close();
                
    }
}
