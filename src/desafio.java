import java.util.Scanner;
import java.util.Locale;

public class desafio {
    public static void main(String[] args) {

        //Esta aplicação tem como base apenas para treinar java

        String nome = "Richard Nogueira";
        String tipoConta = "Conta Corrente";
        double saldo = 5200;
        int opcao = 0;

        System.out.println("*******************************************\n" +
                "Bem Vindo ao Banco Central Desafio!\n\nConfira seus dados abaixo.\n" +
                "Titular: " + nome +
                "\nTipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*******************************************");

        // Declaração dos nomes setados no MENU
        String menu = "-**Digite Sua Opção**-\n\n" +
                "1 - Consultar Saldo\n" +
                "2 - Transferir Valores\n" +
                "3 - Depósito de Valores\n" +
                "4 - Sair";

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldo + "\n");
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Você não possui saldo suficiente para realizar a transferência :(\n");
                } else {
                    saldo -= valor;
                    System.out.println("Novo Saldo: " + saldo + "\n");
                }
            } else if (opcao == 3) {
                System.out.println("Valor do depósito:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo: " + saldo + "\n");
            } else if (opcao != 4) {
                System.out.println("Opção inválida.\n");
            }
        }

        System.out.println("Obrigado e volte sempre!");
    }
}
