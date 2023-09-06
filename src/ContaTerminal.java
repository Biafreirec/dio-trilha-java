import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        double saldo;
        int conta;
        String nomeCliente;
        String agencia;

        System.out.println("Informe o número da conta:\n");
        conta = leia.nextInt();

        System.out.println("Informe o número da agencia:\n");
        agencia = leia.next();

        System.out.println("Informe seu nome:\n");
        nomeCliente = leia.next();

        System.out.println("Informe o seu saldo:\n");
        saldo = leia.nextDouble();

        ContaBanco contaCliente = new ContaBanco(nomeCliente, conta, agencia, saldo);

        System.out.println("Olá, " + contaCliente.getNomeCliente()+ " obrigado por criar uma conta no nosso banco, sua agência é " + contaCliente.getAgencia()+", conta " + contaCliente.getConta() +" e seu saldo " + contaCliente.getSaldo() + " já está disponível para saque.");
    }
}
