import java.util.Locale;
import java.util.Scanner;

public class uri1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int cod, qte;
        double preco = 0.0, total = 0.0;
        
        cod = sc.nextInt();
        qte = sc.nextInt();
        
        switch (cod) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
        }
        
        total = preco * qte;
        System.out.printf("Total: R$ %.2f%n", total);
        
        sc.close();
        
    }
}
