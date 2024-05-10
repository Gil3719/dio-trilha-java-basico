public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("==Deposito realizado.==");
        // mensagem duplicada no caso de um deposito seguido de uma transferencia pq o
        // programa aqui tem acesso as duas contas,
        // em um internet banking a conta destino não retornaria para quem fez a
        // transferencia.
    }

    @Override
    public void sacar(double valor) {
        try {
            verificarSaldo(valor, saldo);

            this.saldo -= valor;
        } catch (SaldoInsuficienteException exception) {
            System.out.println("==Saldo insuficiente, operação não realizada.==");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try {
            verificarSaldo(valor, saldo);

            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("==Transferencia realizada.==");
        } catch (SaldoInsuficienteException exception) {
            System.out.println("==Saldo insuficiente, operação não realizada.==");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    private static void verificarSaldo(double valor, double saldo) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
    }

}
