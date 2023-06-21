package banco;

public class ContaCorrente extends Conta{

    protected ContaCorrente(Cliente cliente) {
        super(cliente);
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Corrente ===");
          super.imprimirInfoConta();
    }
    

}
