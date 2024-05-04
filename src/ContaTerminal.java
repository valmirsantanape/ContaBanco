import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int conta;
        String agencia;
        String nome_cliente;
        double saldo;

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

        System.out.println(
                "Conta: " + conta +
                        "\nAgencia: " + agencia +
                        "\nNome: " + nome_cliente +
                        "\nSaldo: R$" + String.format("%.2f",saldo));

    }
}

/*
* numero
* agencia
* nome
* saldo
* */
