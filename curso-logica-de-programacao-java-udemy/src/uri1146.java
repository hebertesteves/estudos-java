import java.util.Scanner;

public class uri1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int x = sc.nextInt();

            if (x == 0) break;
            
            for (int i = 1; i <= x; i++) {
                if (i == x) System.out.print(i);
                else System.out.print(i + " ");
            }
            
            System.out.println();
        }
        
        sc.close();
        
    }
}
