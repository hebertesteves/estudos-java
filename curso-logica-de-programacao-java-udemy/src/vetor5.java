import java.util.Locale;
import java.util.Scanner;

public class vetor5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] vetor = new int[N];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        
        int somaPar = 0;
        int contPar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                somaPar += vetor[i];
                contPar++;
            }
        }
        
        double media = (double) somaPar / contPar;
        System.out.printf("%.1f%n", media);
        
        sc.close();
    }
}
