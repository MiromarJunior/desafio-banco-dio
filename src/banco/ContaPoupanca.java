package banco;

public class ContaPoupanca extends Conta {
 

      protected ContaPoupanca(Cliente cliente) {
      super(cliente);
     
   }

      @Override
    public void imprimirExtrato() {
     
        System.out.println("=== Conta Poupanca ===");
        super.imprimirInfoConta();
    }
    


}
