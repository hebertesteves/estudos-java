import java.util.Scanner;

public class uri1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, n;
        String tipo = "";
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            valor = sc.nextInt();
            if (valor % 2 == 0 && valor > 0) tipo = "EVEN POSITIVE";
            else if (valor % 2 == 0 && valor < 0) tipo = "EVEN NEGATIVE";
            else if (valor % 2 != 0 && valor > 0) tipo = "ODD POSITIVE";
            else if (valor % 2 != 0 && valor < 0) tipo = "ODD NEGATIVE";
            else tipo = "NULL";
            
            System.out.println(tipo);
        }
        
        sc.close();
        
    }
}
