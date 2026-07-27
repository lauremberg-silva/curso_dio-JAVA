package operadores_aritmedicos;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho de um lado do quadrado: ");
        var lado = scanner.nextInt();
        var resolucao = lado*lado;
        //System.out.printf("O resultado da area do quadrado %sx%s, é igual a %sm²", lado, lado, lado*lado);  ou
        System.out.printf("O resultado da Área do quadrado %sx%s, é igual a %sm²", lado , lado, resolucao);
    }
}
