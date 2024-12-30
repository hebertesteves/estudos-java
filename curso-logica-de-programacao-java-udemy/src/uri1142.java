import java.util.Scanner;

public class uri1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor1 = 1;
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(valor1 + " " + (valor1 + 1) + " " + (valor1 + 2) + " PUM");
            valor1 += 4;
        }
        
        sc.close();
        
    }
}
