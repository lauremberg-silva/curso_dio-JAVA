package estrutural_condicional;

import java.util.Scanner;
public class exercicio08{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor, como o divisor da divisao: ");
        var divisor = scanner.nextInt();

        while (divisor > 0){
            System.out.print("Digite o valor para ser o denominador: ");
            var denominador = scanner.nextInt();

            if (denominador % divisor == 0){
                System.out.println("O denominador escolhido, é divisivel pelo divisor escolhido!");
            }
            else if(denominador % divisor != 0){
                System.out.println("O seu denominador escolhido, NÃO é divisel pelo o divisor escolhido.");
                break;
            }
            System.out.println("Escolha outro número \n ");

        }
        System.out.println("FIM");
    }
}
