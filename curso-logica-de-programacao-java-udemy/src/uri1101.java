import java.util.Scanner;

public class uri1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, troca;
        
        while (true) {
            m = sc.nextInt();
            n = sc.nextInt();
        
            if (m > n) {
               troca = m;
               m = n;
               n = troca;
            }
            
            if (m <= 0 || n <= 0) break;
            int soma = 0;
            for (int i = m; i <= n; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.print("Sum=" + soma);
            System.out.println();
        }
        
        sc.close();
        
    }
}
