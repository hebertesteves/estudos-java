import java.util.Locale;
import java.util.Scanner;

public class vetor4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[] vetor = new double[N];
        
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        
        double media = soma / vetor.length;
        System.out.printf("%.3f%n", media);
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) System.out.printf("%.1f%n", vetor[i]);
        }
        
        sc.close();
        
    }
}
