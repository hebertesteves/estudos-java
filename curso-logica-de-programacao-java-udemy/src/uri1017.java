import java.util.Scanner;
import java.util.Locale;

public class uri1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int horas = sc.nextInt();
        int distancia = sc.nextInt();
        
        double litros = (double) (distancia * horas) / 12.0;
        
        System.out.printf("%.3f%n", litros);
        
        sc.close();
    }
}
