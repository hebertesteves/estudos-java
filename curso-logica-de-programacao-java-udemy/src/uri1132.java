import java.util.Scanner;

public class uri1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, y, troca, soma = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        
        if (x > y) {
            troca = x;
            x = y;
            y = troca;
        }

        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) soma += i;
        }
        
        System.out.println(soma);
        
        sc.close();
    }
}
