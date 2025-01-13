package aula05.resolvido;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    // Metodos Especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    // Metodos
    public void abrirConta(String t) {
        if (!this.getStatus()) {
             this.setTipo(t);
             this.setStatus(true);
             if (t.equals("CC")) {
                this.setSaldo(50);
             } else if (t.equals("CP")){
                this.setSaldo(150);
             }
             
             System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("Não é possivel abrir a conta, pois ja esta aberta!");
        }
    }
    
    public void fecharConta() {
        if (this.getStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("Conta não pode ser fechada, pois tem dinheiro");
            } else if (this.getSaldo() < 0) {
                System.out.println("Conta não pode ser fechada, pois esta em debito");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            }
        } else {
            System.out.println("Não é possivel fechar, pois a conta ja esta fechada");
        }
    }
    
    public void depositar(double valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        } else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }
    
    public void sacar(double valor) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque no valor de R$ " + valor + " feito com sucesso na conta de " + this.getDono());
            } else{
                System.out.println("Saque insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar com uma conta fechada!");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("CC")){
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade");
            }
        } else {
            System.out.println("Impossivel pagar, pois a conta está fechada");
        }
    }
    
    public void estadoAtual() {
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$ " + this.getSaldo());
        if (this.getStatus()) {
            System.out.println("Status: Conta Aberta");
        } else {
            System.out.println("Status: Conta Fechada");
        }
        
    }
    
}
