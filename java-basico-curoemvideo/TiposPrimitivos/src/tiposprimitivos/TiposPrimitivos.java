package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author heber
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite sua nota: ");
        float nota = teclado.nextFloat();
        
        System.out.println("A nota e " + nota);
        System.out.printf("A nota de %s e %.2f \n", nome, nota); 
        System.out.format("A nota de %s e %.1f \n", nome, nota);
    }
    
}
