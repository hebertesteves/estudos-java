import java.util.Scanner;

public class matriz5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrizA = new int[N][M];
        int[][] matrizB = new int[N][M];
        int[][] matrizC = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
        
    }
}
