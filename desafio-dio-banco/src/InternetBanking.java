public class InternetBanking {
    
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");
        
        Cliente sandra = new Cliente();
        sandra.setNome("Sandra");

        Conta cc = new ContaCorrente(carlos);
        Conta poupanca = new ContaPoupanca(sandra);

        cc.depositar(100);
        cc.transferir(50,poupanca);
        System.out.println();
        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}
