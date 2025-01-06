import java.util.Scanner;

public class uri1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contPar = 0;
        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            if (N % 2 == 0) contPar++;
        }
        
        System.out.println(contPar + " valores pares");
        
        sc.close();
        
    }
}
