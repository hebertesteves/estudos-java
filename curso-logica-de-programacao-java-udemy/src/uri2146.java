import java.util.Scanner;

public class uri2146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            System.out.println(N - 1);
        }
        
        sc.close();
    }
}
