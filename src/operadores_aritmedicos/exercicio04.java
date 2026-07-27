package operadores_aritmedicos;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var pessoa1 = scanner.next();                                       // lê apenas a primeira palavra!
        System.out.println("Digite a sua idade: ");
        var idadePessoa1 = scanner.nextInt();
        System.out.println("Digite o nome de outra pessoa: ");
        var pessoa2 = scanner.next();
        System.out.println("Digite a sua idade: ");
        var idadePessoa2 = scanner.nextInt();
        var resolucao = idadePessoa1 - idadePessoa2;

        //System.out.printf("Olá %s e %s, com as seguintes idades respectivamente %s anos e  %s anos, e a diferença de idade de ambos é de %s!", pessoa1, pessoa2, idadePessoa1, idadePessoa2, idadePessoa1 - idadePessoa2);
        System.out.printf("Olá %s e %s, com as seguintes idades respectivamente %s anos e  %s anos, e a diferença de idade de ambos é de %s!", pessoa1, pessoa2, idadePessoa1, idadePessoa2, resolucao);

    }
}
