import java.util.Scanner;

public class uri1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, x, y;
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            int soma = 0;
            if (x % 2 == 0) x++;
            
            for (int j = 0; j < y; j++){
               soma += x;
               x += 2;
            }
            System.out.println(soma);
        }
        
        sc.close();
        
    }
}
