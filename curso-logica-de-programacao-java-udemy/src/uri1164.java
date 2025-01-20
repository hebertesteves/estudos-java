import java.util.Scanner;

public class uri1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int somaDiv = 0;
            
            for (int c = 1; c < num; c++) {
                if (num % c == 0) somaDiv += c;
            }
            
            if (somaDiv == num) {
                System.out.println(num + " eh perfeito");
            } else {
                System.out.println(num + " nao eh perfeito");
            }
        }
        
        sc.close();
        
    }
}
