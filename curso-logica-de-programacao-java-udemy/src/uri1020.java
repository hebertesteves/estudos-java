import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int totalDias = sc.nextInt();
        
        int ano = totalDias / 365;
        int resto = totalDias % 365;
        
        int meses = resto / 30;
        int dias = resto % 30;
        
        System.out.println(ano + " ano(s)");
        System.out.println(meses+ " mes(es)");
        System.out.println(dias + " dia(s)");
        
        sc.close();
        
    }
}
