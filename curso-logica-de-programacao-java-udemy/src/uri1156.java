import java.util.Locale;

public class uri1156 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double S = 1;
        int j = 2;
        for (int i = 3; i <= 39; i += 2) {
            S += (double) i / j;
            j *= 2;
        }
        
        System.out.printf("%.2f%n", S);
    }
}
