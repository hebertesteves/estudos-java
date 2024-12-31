import java.util.Scanner;

public class matriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] matriz = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            int somaLinha = 0;
            for (int j = 0; j < N; j++){
                somaLinha += matriz[i][j];
            }
            System.out.println(somaLinha);
        }
        
        sc.close();
        
    }
}
