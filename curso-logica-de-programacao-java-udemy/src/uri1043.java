import java.util.Locale;
import java.util.Scanner;

public class uri1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double areaTrapezio = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", areaTrapezio);
        }
        
        sc.close();
        
    }
}
