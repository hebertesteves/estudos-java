package aula04;

public class Caneta {
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta() { // Metodo Construtor
        this.tampar();
        this.setCor("Azul");
    }
    
    public Caneta(String m, String c, double p) {
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    } 
    
    public double getPonta() {
        return ponta;
    }
    
    public boolean getTampada() {
        return this.tampada;
    }
    
    public void setTampada(boolean t) {
        this.tampada = t;
    }
    
    public void setPonta(double p) {
        this.ponta = p;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public void tampar() {
       this.setTampada(true);
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
}
