import java.util.Locale;

public class uri1155 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double S = 0;
        for (int i = 1; i <= 100; i++) {
            S += 1.0 / i;
        }
        
        System.out.printf("%.2f%n", S);
            
    }
}
