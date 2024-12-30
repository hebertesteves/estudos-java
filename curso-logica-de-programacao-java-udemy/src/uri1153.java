
import java.util.Scanner;

public class uri1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fat = 1;
        
        n = sc.nextInt();
        
        for (int i = n; i > 1; i--) {
            fat *= i;
        }
        
        System.out.println(fat);
        
        sc.close();
        
    }
}
