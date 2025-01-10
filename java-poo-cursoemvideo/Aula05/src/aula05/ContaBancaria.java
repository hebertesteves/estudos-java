package aula05;

public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBancaria() {
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        if (tipo.equals("CC") || tipo.equals("CP")) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo invalido!");
        }
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo) {
        if (!this.getStatus()) {
            this.setTipo(tipo);
            this.setStatus(true);
            if (this.getTipo().equals("CC")) {
                saldo = 50;
            } else if (this.getTipo().equals("CP")) {
                saldo = 150;
            }
            
            System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("Conta ja esta aberta!");
        }
        
    }
    
    public void fecharConta() {
        if (this.getStatus()) {
            if (this.getSaldo() == 0) {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso");
            } else if (this.getSaldo() > 0) {
                System.out.println("Não é possivel fechar a conta, tem dinheiro");
            } else if (this.getSaldo() < 0) {
                System.out.println("Não é possivel fechar a conta, está em debito");
            }
        } else {
            System.out.println("A conta ja esta fechada!");
        }
    }
    
    public void sacar(double saque) {
        if (this.getStatus()) {
            if (this.getSaldo() >= saque) {
                this.saldo -= saque;
                System.out.println("O valor do saque feito foi de R$ " + saque);
            } else {
                System.out.println("Saldo incuficiente para realizar o saque");
            }
        } else {
            System.out.println("Não pode sacar, pois a conta não está aberta");
        }
    }
    
    public void depositar(double deposito) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Deposito feito com sucesso");
        } else {
            System.out.println("Nao e possivel fazer o deposito com a conta fechada");
        }
    }
    
    public void pagarMensal() {
        double valorMensalidade = this.getTipo().equals("CC") ? 12 : 20;
        if (this.getStatus()) {
            if (this.getSaldo() >= valorMensalidade) {
                this.saldo -= valorMensalidade;
                System.out.println("Mensalidade paga no valor de R$ " + valorMensalidade + " com sucesso!");
            } else {
                System.out.println("Você não tem saldo, para pagar a mensalidade");
            }
        } else {
            System.out.println("Não é possivel pagar a mensalidade, pois a conta está fechada");
        }    
    }
    
    public void mostrarConta() {
        System.out.println("Numero da Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Dono da Conta: " + this.getDono());
        System.out.println("Saldo da Conta: R$ " + this.getSaldo());
        System.out.println("Status da Conta: " + this.getStatus());
    }
    
}
