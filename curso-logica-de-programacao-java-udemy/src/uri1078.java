import java.util.Scanner;

public class uri1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + N + " = " + (i * N));
        }
        
        sc.close();
        
    }
}
