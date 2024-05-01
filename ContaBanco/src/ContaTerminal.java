import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nomeCliente;
        int numero;
        String agencia;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("digite o número da Agência:");
        agencia = scanner.nextLine();
        
        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", Conta " + numero + " e seu Saldo " + 
        saldo + " já está disponível para saque.");

        scanner.close();
    }
}
