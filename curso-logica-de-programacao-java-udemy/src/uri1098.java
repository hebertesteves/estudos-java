import java.util.Locale;

public class uri1098 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        for (double i = 0; i <= 2; i += 0.2) { 
            for (double j = 1; j <= 3; j++) { 
                if (i == 0 || Math.round(i * 10) == 20 || Math.round(i * 10) == 10) {
                    System.out.printf("I=%.0f J=%.0f%n", i, j + i);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", i, j + i); 
                }
            }
        }
    }
}
