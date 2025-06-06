import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner coletaDados = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = coletaDados.nextLine();

        System.out.print("Digite o número da conta: ");
        String conta = coletaDados.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = coletaDados.nextDouble();


        ContaBancaria contaBancaria = new ContaBancaria(nome, conta, saldoInicial);
        System.out.println("Conta bancária criada com sucesso.");


        String opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("Q - Sair");
            System.out.print("Opção: ");
            opcao = coletaDados.next();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = coletaDados.nextDouble();
                    contaBancaria.depositar(deposito);
                    break;
                case "2":
                    System.out.print("Digite o valor para saque: ");
                    double saque = coletaDados.nextDouble();
                    contaBancaria.sacar(saque);
                    break;
                case "3":
                    contaBancaria.exibirSaldo();
                    break;
                case "Q":
                case "q":
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (!opcao.equalsIgnoreCase("Q"));

        coletaDados.close();
    }
}
