import java.util.Locale;
import java.util.Scanner;

public class uri1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        float nota1, nota2, nota3, nota4, media;
        
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();
        nota4 = sc.nextFloat();
        
        media = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4 * 1) / 10;
        System.out.printf("Media: %.1f%n", media);
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            
            float notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            
            media = (media + notaExame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            
            System.out.printf("Media final: %.1f%n", media);
        } else {
            System.out.println("Aluno reprovado.");
        }
        
        sc.close();
        
    }
}
