/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author heber
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = (int) tamanhoTela.getWidth();
        int altura = (int) tamanhoTela.getHeight();
        
        System.out.println("Sua tela está em resolução " + largura + " x " + altura);
    }
    
}
