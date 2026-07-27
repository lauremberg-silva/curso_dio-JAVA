package estrutural_condicional;

import java.io.PrintStream;
import java.util.Scanner;
public class exercicio07 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.print("Digite um valor para iniciar o intervalo: ");
        var valor1 = scanner.nextInt();
        System.out.print("Digite um segundo valor para colocar o fim do intervalo: ");
        var valor2 = scanner.nextInt();

        System.out.println("Escolha");
        System.out.println("1 - Pares \n2 - Impares");
        System.out.print("Digite sua escolha: ");

        var opcao = scanner.nextInt();

        for (var i = valor2 ; i >= valor1 ; i--){
            if (opcao == 1 && i % 2 == 0){
                System.out.println(i);
            }
            else if (opcao == 2 && i % 2 != 0){
                System.out.println(i);
            }

        }
    }
}

