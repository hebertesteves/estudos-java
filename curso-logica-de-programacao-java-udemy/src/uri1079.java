import java.util.Locale;
import java.util.Scanner;

public class uri1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double valor1, valor2, valor3, media;
        
        for (int i = 0; i < n; i++) {
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();
            
            media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
            System.out.printf("%.1f%n", media);
        }
        
        sc.close();
        
    }
}
