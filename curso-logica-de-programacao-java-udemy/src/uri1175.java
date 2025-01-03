import java.util.Scanner;

public class uri1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[20];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        
        int index = vetor.length - 1;
        for (int i = 0; i < vetor.length / 2; i++) {
            int troca = vetor[i];
            vetor[i] = vetor[index - i];
            vetor[index - i] = troca;
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N["+ i + "] = " + vetor[i]);
        }
        
        sc.close();
        
    }
}
