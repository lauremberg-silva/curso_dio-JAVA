package operadores_aritmedicos;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Base do Retângulo: ");
        var base = scanner.nextDouble();                                  // float = double = ,
        System.out.println("Digite a Área do Retângulo: ");
        var area = scanner.nextDouble();
        var resolucao = base*area;
        //System.out.printf("O calculo da base(%s) e da area(%s) do retângulo, é igual a %sm²",base , area, base*area);
        System.out.printf("O calculo da base(%s) e da area(%s) do retângulo, é igual a %sm²",base , area, resolucao);
    }
}
