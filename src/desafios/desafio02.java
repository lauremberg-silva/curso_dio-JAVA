package desafios;

import java.util.Scanner;
public class desafio02 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite o valor do Saldo da sua conta: ");
        var saldo  = scanner.nextInt();
        System.out.println("Digite o valor que voce deseja para fazer a transação: ");
        var valorTrancacao = scanner.nextInt();

        if (saldo < valorTrancacao){
            System.out.println("Saldo Insuficiente");
        }else{
            System.out.println("Transação Aprovada");
        }
        scanner.close();
    }
}
