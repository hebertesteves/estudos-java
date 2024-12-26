/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepitaswing;
import javax.swing.JOptionPane;
/**
 *
 * @author heber
 */
public class ExercicioRepitaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
       // int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero: "));
        //System.out.println(numero);
        
        int valor, totalValor = 0, totalPar = 0, totalImpar = 0, acimaCem = 0, soma = 0, media = 0;
        
        do {
           valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html> Informe um numero: <br><em> (valor 0 interrompe) </em></br> </html>"));
           
           if (valor == 0) break;
           
           totalValor++;
           
           if (valor % 2 == 0) {
               totalPar++;
           } else {
               totalImpar++;
           }
           
           if (valor > 100) {
               acimaCem++;
           }
           
           soma += valor;
        } while (valor != 0);
        
        if (totalValor > 0) media = soma / totalValor;
        
        
        JOptionPane.showMessageDialog(null, "<html> Resultado final <br> ---------------- "
            + "<br> Total de Valores: " + totalValor
            + "<br> Total de Pares: " + totalPar
            + "<br> Total de Ímpares: " + totalImpar
            + "<br> Acima de 100: " + acimaCem
            + "<br> Média dos valores: " + media);
        
        
    }
    
}
