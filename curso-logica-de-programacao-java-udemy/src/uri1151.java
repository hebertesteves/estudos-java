import java.util.Scanner;

public class uri1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int valor1 = 0;
        int valor2 = 1;
        int valor3 = valor1 + valor2;
        
        System.out.print(valor1 + " ");
        System.out.print(valor2 + " ");
        System.out.print(valor3);
        for (int i = 0; i < N - 3; i++) {
            valor1 = valor2;
            valor2 = valor3;
            valor3 = valor1 + valor2;
            System.out.print(" " + valor3);
        }
        
        System.out.println();
        sc.close();
        
    }
}
