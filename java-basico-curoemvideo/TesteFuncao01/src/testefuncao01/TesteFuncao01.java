/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author heber
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // soma(5,2);
        int sm = soma(3, 8);
        System.out.println("A soma e " + sm);
    }
    
    /*
    public static void soma(int a, int b){
        int soma = a + b;
        System.out.println("A soma e " + soma);
    }
    */
    
    public static int soma(int a, int b){
        int soma = a + b;
        return soma;
    }
    
}
