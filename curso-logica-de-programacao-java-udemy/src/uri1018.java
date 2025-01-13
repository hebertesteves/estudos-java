import java.util.Scanner;

public class uri1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int valor = sc.nextInt();
        System.out.println(valor);
        
        int nota = 100;
        int cedula = valor / nota;
        System.out.println(cedula + " nota(s) de R$ 100,00");
        int resto = valor % nota;
        
        nota = 50;
        cedula = resto / nota;
        System.out.println(cedula + " nota(s) de R$ 50,00");
        resto %= nota;
        
        nota = 20;
        cedula = resto / nota;
        System.out.println(cedula + " nota(s) de R$ 20,00");
        resto %= nota;
        
        nota = 10;
        cedula = resto / nota;
        System.out.println(cedula + " nota(s) de R$ 10,00");
        resto %= nota;
        
        nota = 5;
        cedula = resto / nota;
        System.out.println(cedula + " nota(s) de R$ 5,00");
        resto %= nota;
        
        nota = 2;
        cedula = resto / nota;
        System.out.println(cedula + " nota(s) de R$ 2,00");
        resto %= nota;
        System.out.println(resto + " nota(s) de R$ 1,00");
        
        sc.close();
    }
}
