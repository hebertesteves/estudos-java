import java.util.Scanner;

public class uri1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor = sc.nextInt();
        int[] vetor = new int[10];
        
        vetor[0] = valor;
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N["+ i + "] = " + vetor[i]);
        }
        
        sc.close();
    }
}
