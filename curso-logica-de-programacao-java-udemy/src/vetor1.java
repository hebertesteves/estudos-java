import java.util.Locale;
import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] vetor = new double[n];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }
        
        double maior = vetor[0];
        int indexMaior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indexMaior = i;
            }
        }
        
        System.out.printf("%.1f%n", maior);
        System.out.println(indexMaior);
         
        sc.close();
        
    }
}
