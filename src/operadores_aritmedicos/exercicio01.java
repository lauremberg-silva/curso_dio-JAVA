package operadores_aritmedicos;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var name = scanner.next();
        System.out.println("Digite a sua idade: ");
        var age = scanner.nextInt();
        System.out.printf("Olá %s, sua idade é %s!", name, age);
    }
}
