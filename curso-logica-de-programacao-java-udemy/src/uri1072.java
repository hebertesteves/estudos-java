import java.util.Scanner;

public class uri1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, valor, contIn = 0, contOut = 0;
        
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            valor = sc.nextInt();
            if (valor >= 10 && valor <= 20) contIn++;
            else contOut++;
        }
        
        System.out.println(contIn + " in");
        System.out.println(contOut + " out");
        
        sc.close();
        
    }
}
