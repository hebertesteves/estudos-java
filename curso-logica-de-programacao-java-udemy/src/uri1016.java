
import java.util.Scanner;


public class uri1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int distancia = sc.nextInt();
        int minutos = 2 * distancia;
        
        System.out.printf("%d minutos%n", minutos);
        
        sc.close();
    }
}
