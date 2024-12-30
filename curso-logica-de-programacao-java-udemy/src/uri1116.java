import java.util.Locale;
import java.util.Scanner;

public class uri1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, x, y;
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }
        
        sc.close();
        
    }
}
