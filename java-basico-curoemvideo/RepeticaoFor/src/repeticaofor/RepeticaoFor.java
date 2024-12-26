/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author heber
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int cc = 0; cc <= 100; cc += 10 ) {
            System.out.println("Cambalhota " + cc);
        }

        
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 3; j += 2) {
                System.out.println(i + " " + j);
            }
        }
            
            
    }
    
}
