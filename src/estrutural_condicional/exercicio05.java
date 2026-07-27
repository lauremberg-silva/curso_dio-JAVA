package estrutural_condicional;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        var scanner =  new Scanner(System.in);
        System.out.println("Digite um valor para ver a tabuada: ");
        var  x = scanner.nextInt();
        var i = 1;
        while (i <= 10){
            var tabuada = x * i;
            System.out.printf("A tabuada de %s é: %sx%s = %s\n", x , x, i, tabuada);
            i++;

        }
    }

}
