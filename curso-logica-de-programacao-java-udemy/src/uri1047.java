import java.util.Scanner;

public class uri1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracao;
        
        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();
        
        int instanteInicial = horaInicial * 60 + minutoInicial;
        int instanteFinal = horaFinal * 60 + minutoFinal;
        
        if (instanteFinal > instanteInicial) {
            duracao = instanteFinal - instanteInicial;
        } else {
             duracao = (24 * 60 - instanteInicial) + instanteFinal;
        }
        
        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;
        
        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        
        sc.close();
        
    }
}
