import java.util.Locale;
import java.util.Scanner;

public class vetor7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        String[] nomes = new String[N];
        double[] notas1 = new double[N];
        double[] notas2 = new double[N];
        
        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }
        
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < N; i++) {
            double media = (notas1[i] + notas2[i]) / 2.0;
            if (media >= 6) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
