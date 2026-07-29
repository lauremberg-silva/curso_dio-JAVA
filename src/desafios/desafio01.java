package desafios;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        var valorSalario = scanner.nextDouble();
        System.out.println("Digite a alíquota do seu benefício: ");
        var valorBeneficio = scanner.nextDouble();

        double valorImposto = 0;

        if (valorSalario >= 0 && valorSalario <= 1000) {
            valorImposto = 0.05 * valorSalario;
        } else if (valorSalario >= 1001 && valorSalario <= 2500) {
            valorImposto = 0.10 * valorSalario;
        } else {
            valorImposto = 0.15 * valorSalario;
        }

        double saida = valorSalario - valorImposto + valorBeneficio;

        System.out.printf("Esse é seu salário descontando os impostos \n %.2f%n", saida);

        scanner.close();
    }
}
