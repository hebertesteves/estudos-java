package aula02;

public class Celular {
    String modelo;
    double tamanhoTela;
    String cor;
    int bateria;
    String sistemaOperacional;
    boolean ligado;
    
    void ligar() {
        ligado = true;
    }
    
    void desligar() {
        ligado = false;
    }
    
    void exibirCelular() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tamnho da Tela: " + this.tamanhoTela);
        System.out.println("Cor: " + this.cor);
        System.out.println("Bateria: " + this.bateria + " %");
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
        if (ligado) {
            System.out.println("O Celular está ligado");
        } else {
            System.out.println("O Celular não está ligado");
        }
    }
        
    void mandarMensagem() {
      if (ligado) {
          System.out.println("Enviando mensagem...");
      } else {
          System.out.println("ERRO! Ligue o celular");
      }
          
    }
    
    
}
