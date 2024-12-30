import java.util.Scanner;

public class uri1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, quantia, totalRato = 0, totalCoelho = 0, totalSapo = 0;
        char tipo;
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            quantia = sc.nextInt();
            tipo = sc.next().charAt(0);
            
            switch (tipo) {
                case 'R' -> totalRato += quantia;
                case 'C' -> totalCoelho += quantia;
                case 'S' -> totalSapo += quantia;
            }
        }
        
        int totalCobaia = totalRato + totalCoelho + totalSapo;
        double percentualRato =  100.0 * ((double) totalRato / totalCobaia);
        double percentualCoelho =  100.0 * ((double) totalCoelho / totalCobaia);
        double percentualSapo =  100.0 * ((double) totalSapo / totalCobaia);
        
        System.out.println("Total: " + totalCobaia + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelho);
        System.out.println("Total de ratos: " + totalRato);
        System.out.println("Total de sapos: " + totalSapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRato);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapo);
        
        
        sc.close();
        
    }
}
