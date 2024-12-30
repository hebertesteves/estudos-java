import java.util.Scanner;

public class uri1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int valor = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.println(valor + " " + ( (int) Math.pow(valor, 2)) + " " + ( (int) Math.pow(valor, 3)));
            System.out.println(valor + " " + ( (int) Math.pow(valor, 2) + 1) + " " + ( (int) Math.pow(valor, 3) + 1));
            valor++;
        }
        
        sc.close();
    }
}
