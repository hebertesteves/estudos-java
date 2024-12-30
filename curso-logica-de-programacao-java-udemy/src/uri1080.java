import java.util.Scanner;

public class uri1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, posicaoMaior = 1, maior = 0;
        
        for (int i = 1; i <= 100; i++) {
            n = sc.nextInt();
            if (n > maior) {
                maior = n;
                posicaoMaior = i;
            }
        }
        
        System.out.println(maior);
        System.out.println(posicaoMaior);
        
        sc.close();
        
    }
}
