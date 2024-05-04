import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int conta;
        String agencia;
        String nome_cliente;
        double saldo;

        System.out.println("Cadastro de cliente");
        System.out.println("Informe o numero da sua conta: ");
        conta = sc.nextInt();
        System.out.println("Informe o codigo de sua agencia com o digito: ");
        agencia = sc.next();
        System.out.println("Nome do Cliente: " );
        sc.nextLine();
        nome_cliente = sc.nextLine();
        System.out.println("Informe seu saldo: ");
        saldo = sc.nextDouble();
        System.out.println("Conta cadastrada");
        System.out.println();
        System.out.println("Informações do usuário: \n");

        if (saldo > 0) {
            System.out.printf(String.format("Olá %s, obrigado por criar uma conta em nosso banco.\n" +
                            "\nagencia: %s" +
                            "\nconta: %d\n" +
                            "\nSeu saldo de R$%.2f já está disponível para saque."
                            , nome_cliente, agencia, conta, saldo) );
        }else {
            System.out.printf(String.format("Olá %s, obrigado por criar uma conta em nosso banco.\n" +
                "\nagencia: %s" +
                "\nconta: %d\n" +
                "\nSaldo: R$%.2f"  +
                "\nInfelizmente no momento você não tem saldo disponivel para saque." +
                "\nPor favor, realize um deposito."
                , nome_cliente, agencia, conta, saldo) );

        }

    }
}




