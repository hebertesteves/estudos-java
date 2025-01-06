package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        
        c2.status();
        c2.rabiscar();
        
        Celular s23 = new Celular();
        s23.modelo = "Samsung Galaxy S23";
        s23.tamanhoTela = 6.1;
        s23.cor = "Cinza";
        s23.bateria = 43;
        s23.sistemaOperacional = "Android";
        s23.ligar();
        s23.exibirCelular();
        
        s23.desligar();
        s23.mandarMensagem();
        
     
    }
    
}
