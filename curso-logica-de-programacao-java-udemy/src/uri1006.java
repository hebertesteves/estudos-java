import java.util.Locale;
import java.util.Scanner;


public class uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();
        
        double media = (notaA * 2 + notaB * 3 + notaC * 5) / 10;
        
        System.out.printf("MEDIA = %.1f%n", media);
        
        sc.close();
    }
}
