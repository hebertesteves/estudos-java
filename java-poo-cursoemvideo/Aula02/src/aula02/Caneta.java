package aula02;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if (tampada) {
            System.out.println("ERRO! NAO POSSO RABISCAR");
        } else {
            System.out.println("Estou Rabiscando!");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    

}
