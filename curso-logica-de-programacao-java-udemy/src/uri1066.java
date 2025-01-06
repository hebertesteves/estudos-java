import java.util.Scanner;

public class uri1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contPar = 0, contImpar = 0, contPositivo = 0, contNegativo = 0;
        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            
            if (N > 0) contPositivo++;
            else if (N < 0) contNegativo++;
            
            if (N % 2 == 0) contPar++;
            else contImpar++;
        }
        
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar+ " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");
        
        sc.close();
    }
}
