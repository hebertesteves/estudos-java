import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] vetorA = new int[N];
        int[] vetorB = new int[N];
        int[] vetorC = new int[N];
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
        
        sc.close();
        
    }
}
