import java.util.Scanner;
import java.util.Locale;

public class uri1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        
        double media = (notaA * 3.5 + notaB * 7.5) / 11;
        
        System.out.printf("MEDIA = %.5f%n", media);
        
        sc.close();
    }
}
