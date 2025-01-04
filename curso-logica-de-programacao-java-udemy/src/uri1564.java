import java.util.Scanner;

public class uri1564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()) {
            int N = sc.nextInt();
            if (N > 0) System.out.println("vai ter duas!");
            else System.out.println("vai ter copa!");   
        }
        
       sc.close();
        
    }
}
