import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        String name = scanner.next();
        System.out.println("Qual a sua idade: ");
        int age = scanner.nextInt();
        System.out.println("Olá " + name + " sua idade é " + age + "anos!");
    }
}
