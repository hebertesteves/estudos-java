import java.util.Scanner;

public class uri1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;
        
        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    break;
            }
            
            codigo = sc.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
        
    }
}
