package desafios;

import java.util.Scanner;
public class desafio03 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu tipo de conta(corrente, poupanca, investimento): ");
        String tipoConta = scanner.nextLine();


        var contaValida =
                        tipoConta.equals("corrente") ||
                        tipoConta.equals("poupanca") ||
                        tipoConta.equals("investimento");

        if (contaValida) {
            System.out.printf(
                    "Bem-vindo(a), %s! Sua conta %s esta pronta para uso.%n", nome, tipoConta);
        } else {
            System.out.println("Tipo de conta invalido.");
        }

        scanner.close();
    }
}
