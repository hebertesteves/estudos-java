import java.util.Scanner;

public class vetor6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        String[] vetorNome = new String[N];
        int[] vetorIdade = new int[N];
        
        for (int i = 0; i < N; i++) {
            vetorNome[i] = sc.next();
            vetorIdade[i] = sc.nextInt();
        }
        
        int maiorIdade = vetorIdade[0];
        String maisVelho = "";
        for (int i = 0; i < N; i++) {
            if (vetorIdade[i] > maiorIdade) {
                maiorIdade = vetorIdade[i];
                maisVelho = vetorNome[i];
            }
        }
        
        System.out.println("Pessoa mais velha: " + maisVelho);
        sc.close();
        
    }
}
