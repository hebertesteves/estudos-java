import java.util.Scanner;

public class uri1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palavra1, palavra2, palavra3;
        
        palavra1 = sc.nextLine();
        palavra2 = sc.nextLine();
        palavra3 = sc.nextLine();
        
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
        
        sc.close();
        
    }
}
