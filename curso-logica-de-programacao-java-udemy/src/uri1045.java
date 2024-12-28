import java.util.Locale;
import java.util.Scanner;

public class uri1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, A, B, C;
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        if (a > b && b > c) {
            A = a;
            if (b > c) {
                B = b;
                C = c;
            } else {
                B = c;
                C = b;
            }
        } else if (b > a && b > c) {
            A = b;
            if (a > c) {
                B = a;
                C = c;
            } else {
                B = c;
                C = a;
            }
        } else {
            A = c;
            if (a > b) {
                B = a;
                C = b;
            } else {
                B = b;
                C = a;
            }
        }
        
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            
            if (Math.pow(A, 2) == Math.pow(B , 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (Math.pow(A, 2) < Math.pow(B , 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            
            if (A == B && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ( (A == B && B != C) || (A == C && C != B) || (B == C && B != A) ) {
                System.out.println("TRIANGULO ISOSCELES");
            } 
            
        }
        
        sc.close();
        
    }
}
