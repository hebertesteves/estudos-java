import java.util.Scanner;

public class uri1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int golGremio, golInter, contGrenais = 0, vitoriaInter = 0, vitoriaGremio = 0, empate = 0;
       
        golInter = sc.nextInt();
        golGremio = sc.nextInt();
       
        
        contGrenais++;
        
        if (golGremio > golInter) vitoriaGremio++;
        else if (golInter > golGremio) vitoriaInter++;
        else empate++;
        
        System.out.println("Novo grenal (1-sim 2-nao)");
        int resp = sc.nextInt();
        
        while (resp != 2) {
            
            golInter = sc.nextInt();
            golGremio = sc.nextInt();
            contGrenais++;
            
            if (golGremio > golInter) vitoriaGremio++;
            else if (golInter > golGremio) vitoriaInter++;
            else empate++;
            
            System.out.println("Novo grenal (1-sim 2-nao)");
            resp = sc.nextInt();
        }
        
        System.out.println(contGrenais + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);
        
        if (vitoriaGremio > vitoriaInter) System.out.println("Gremio venceu mais");
        else if (vitoriaInter > vitoriaGremio) System.out.println("Inter venceu mais");
        else System.out.println("Empatou");
        
        sc.close();
        
    }
}
