import java.util.Locale;
import java.util.Scanner;

public class vetor8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double[] altura = new double[N];
        char[] sexo = new char[N];
        
        for (int i = 0; i < N; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }
        
        double maiorAltura = altura[0];
        for (int i = 0; i < N; i++) {
            if (altura[i] > maiorAltura) maiorAltura = altura[i];
        }
        
        double menorAltura = altura[0];
        for (int i = 0; i < N; i++) {
            if (altura[i] < menorAltura) menorAltura = altura[i];
        }
        
        double alturaF = 0.0;
        int contF = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'F') {
                alturaF += altura[i];
                contF++;
            }
        }
        double mediaF = alturaF / contF;
        
        int contM = 0;
        for (int i = 0; i < N; i++) {
            if (sexo[i] == 'M') contM++;
        }
        
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaF);
        System.out.println("Numero de homens = " + contM);
        
        
        sc.close();
        
    }
}
