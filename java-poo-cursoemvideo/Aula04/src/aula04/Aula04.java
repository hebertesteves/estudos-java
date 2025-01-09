package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        // c1.modelo = "BIC";
        
        c1.setPonta(0.5);
        // c1.ponta = 0.5;
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        
        Caneta c2 = new Caneta("NIC", "Amarela", 0.4);
        c2.status();
        
        Caneta c3 = new Caneta("BIC", "Laranja", 1.5);
        c3.status();
    }
    
}
