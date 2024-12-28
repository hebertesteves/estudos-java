import java.util.Locale;
import java.util.Scanner;


public class uri1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double salario, reajuste;
        int percentual;
        
        salario = sc.nextDouble();
        
        if (salario >= 0.0 && salario <= 400.00) {
            percentual = 15;
        } else if (salario >= 400.01 && salario <= 800.00) {
            percentual = 12;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            percentual = 10;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }
        
        reajuste = (salario * percentual) / 100;
        salario += reajuste;
        
        System.out.printf("Novo salario: %.2f%n", salario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%%n", percentual);
        
        sc.close();
        
    }
}
