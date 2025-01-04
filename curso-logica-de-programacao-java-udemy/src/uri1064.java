import java.util.Locale;
import java.util.Scanner;

public class uri1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int contPositivo = 0;
        double soma = 0;
        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();
            if (valor > 0) {
                soma += valor;
                contPositivo++;
            } 
        }
        
        double media = (double) soma / contPositivo;
        
        System.out.println(contPositivo + " valores positivos");
        System.out.printf("%.1f%n", media);
        
        sc.close();
    }
}
