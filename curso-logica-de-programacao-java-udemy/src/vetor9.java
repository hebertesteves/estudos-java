import java.util.Locale;
import java.util.Scanner;

public class vetor9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        String[] nomeMercadoria = new String[N];
        double[] precoCompra = new double[N];
        double[] precoVenda = new double[N];
        
        for (int i = 0; i < N; i++) {
            nomeMercadoria[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();
        }
        
        int lucroAbaixo10 = 0, lucroEntre10 = 0, lucroAcima20 = 0;
        for (int i = 0; i < N; i++) {
            double lucro = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;
            if (lucro < 10) lucroAbaixo10++;
            else if (lucro >= 10 && lucro <= 20) lucroEntre10++;
            else if (lucro > 20) lucroAcima20++;
        }
        
        double totalCompra = 0.0;
        for (int i = 0; i < N; i++) {
            totalCompra += precoCompra[i];
        }
        
        double totalVenda = 0.0;
        for (int i = 0; i < N; i++) {
            totalVenda += precoVenda[i];
        }
        
        double lucroTotal = totalVenda - totalCompra;
        
        System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
        System.out.println("Lucro entre 10% e 20%: " + lucroEntre10);
        System.out.println("Lucro acima de 20%: " + lucroAcima20);
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);
        
        sc.close();
        
    }
}
