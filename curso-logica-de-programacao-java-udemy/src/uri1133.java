import java.util.Scanner;

public class uri1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X, Y, troca;
        X = sc.nextInt();
        Y = sc.nextInt();
        
        if (X > Y) {
            troca = X;
            X = Y;
            Y = troca;
        }
        
        for (int i = X + 1; i < Y; i++) {
            if (i % 5 == 2 || i % 5 == 3) System.out.println(i);
        }
        
        sc.close();
    }
}
