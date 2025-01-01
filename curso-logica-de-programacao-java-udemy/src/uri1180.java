import java.util.Scanner;

public class uri1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] vetor = new int[N];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        
        int menor = vetor[0];
        int posicaoMenor = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }
        
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicaoMenor);
        
        sc.close();
    }
}
