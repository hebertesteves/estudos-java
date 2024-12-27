import java.util.Scanner;
import java.util.Locale;

public class uri1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int hours = sc.nextInt();
        double valueHours = sc.nextDouble();
        
        double salary = valueHours * hours;
        
        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
