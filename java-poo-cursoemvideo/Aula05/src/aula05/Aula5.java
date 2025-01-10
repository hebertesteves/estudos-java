package aula05;

public class Aula5 {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.abrirConta("CP");
        conta1.depositar(2500.0);
        conta1.sacar(2630.0);
        conta1.pagarMensal();
        conta1.fecharConta();
        conta1.mostrarConta();
    }
    
}
