import java.util.Scanner;

public class uri2483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int I = sc.nextInt();
        String resp = "Feliz nat";
        
        for (int c = 0; c < I; c++) {
            resp += "a";
        }
        resp += "l!";
        
        System.out.println(resp);
        
        sc.close();
        
    }
}
