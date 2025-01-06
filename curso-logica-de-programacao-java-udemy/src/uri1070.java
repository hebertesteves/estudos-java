import java.util.Scanner;

public class uri1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        if (N % 2 == 0) N += 1;
        
        for (int i = 0; i < 6; i++) {
            System.out.println(N);
            N += 2;
        }
        
        sc.close();
        
    }
}
