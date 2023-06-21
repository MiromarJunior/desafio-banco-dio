package banco;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Cliente cli = new Cliente();
        cli.setNome("Miromar");

        Conta cc = new ContaCorrente(cli);
        cc.depositar(50);

        Conta popanca = new ContaPoupanca(cli);
        cc.transferir(popanca, 20);

        cc.imprimirExtrato();
        popanca.imprimirExtrato();

    }
}
