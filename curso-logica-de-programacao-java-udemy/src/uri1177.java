import java.util.Scanner;

public class uri1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] vetor = new int[1000];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i % N;
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N["+ i + "] = " + vetor[i]);
        }
        
        sc.close();
        
    }
}
