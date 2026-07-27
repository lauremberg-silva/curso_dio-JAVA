package estrutural_condicional;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Digite a sua Altura: ");
        var altura = scanner.nextDouble();
        System.out.println("Digite o seu Peso: ");
        var peso = scanner.nextDouble();
        var imc = peso/(altura*altura);
        var mensagem = "Você se encontra com o --> ";
        System.out.printf("%s", mensagem);
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        }
        if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal");
        }
        if (imc >= 25 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        }
        if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade 1(Inicial)");
        }
        if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade 2(Severo)");
        }
        if (imc >= 40){
            System.out.println("Obesidade 3(Mórbida)");
        }
        }
    }

