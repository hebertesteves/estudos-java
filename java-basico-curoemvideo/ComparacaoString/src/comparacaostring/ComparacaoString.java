/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author heber
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Hebert";
        String nome2 = "Hebert";
        String nome3 = new String("Hebert");
        String res = (nome1.equals(nome3)) ? "Igual" : "Diferente";
        System.out.println(res);
    }
    
}
