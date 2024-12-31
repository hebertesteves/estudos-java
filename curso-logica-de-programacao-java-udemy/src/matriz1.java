import java.util.Scanner;

public class matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M, N;
        M = sc.nextInt();
        N = sc.nextInt();
        int[][] matriz = new int[M][N];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
               if (matriz[i][j] < 0) System.out.println(matriz[i][j]);
            }
        }
        
        sc.close();
        
    }
}
