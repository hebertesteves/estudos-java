/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistema;
import java.util.Locale;

/**
 *
 * @author heber
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String idioma = locale.getDisplayLanguage();
        System.out.println("Seu sistema está em " + idioma);
    }
    
}
