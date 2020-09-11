import java.util.Scanner;

public class Exercicio2b {
    public static void main(String args[]) {
       
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Digite o Valor do base do retangulo:");
        base = keyboard.nextInt();

        System.out.println("Digite o Valor da altura do retangulo:");
        altura = keyboard.nextInt();

        area = base * altura;

        System.out.println("A area do retangulo e: " + area);
    }
}