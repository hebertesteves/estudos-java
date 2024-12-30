import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] vetor = new int[N];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        
        int contPar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                contPar++;
            }   
        }
        System.out.println();
        System.out.println(contPar);
        
        sc.close();
        
    }
}
