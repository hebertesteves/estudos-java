import java.util.Scanner;

public class uri1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int totalSegundos = sc.nextInt();
        
        int hora = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        
        int minutos = resto / 60;
        int segundos = resto % 60;
        
        System.out.println(hora + ":" + minutos + ":" + segundos);
        
        sc.close();
    }
}
