/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author heber
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] v = {3.5, 2.75, 9, -4.5};
        
        Arrays.sort(v);
        
        for (double valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
