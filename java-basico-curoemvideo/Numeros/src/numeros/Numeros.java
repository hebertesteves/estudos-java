/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author heber
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resp = "";
        Scanner teclado = new Scanner(System.in);
       
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            
            System.out.println("Você quer continuar? ");
            resp = teclado.next();
        } while (resp.equals("S"));
        
        /*
        while(resp.equals("S")) {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            
            System.out.println("Você quer continuar? ");
            resp = teclado.next();
        }
        
        System.out.println("A soma de todos os valores é " + s);
        */

    }
    
}
