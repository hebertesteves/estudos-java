import java.util.Locale;
import java.util.Scanner;


public class uri1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome = sc.nextLine();
        double salarioF = sc.nextDouble();
        double valorVendas = sc.nextDouble();
        
        double comissao = (valorVendas * 15) / 100;
        
        double total = salarioF + comissao;
        
        System.out.printf("TOTAL = R$ %.2f%n", total);
        
        sc.close();
    }
}
