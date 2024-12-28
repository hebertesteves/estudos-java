import java.util.Scanner;

public class uri1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int horaInicial, horaFinal, duracao;
        
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        
        if (horaInicial > horaFinal) {
            duracao = (24 - horaInicial) + horaFinal;
        } else if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
        
        sc.close();
        
    }
}
