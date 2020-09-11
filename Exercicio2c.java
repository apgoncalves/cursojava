import java.util.Scanner;

public class Exercicio2c {
    public static void main(String args[]) {
       
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Digite o Valor do base do triangulo:");
        base = keyboard.nextInt();

        System.out.println("Digite o Valor da altura do triangulo:");
        altura = keyboard.nextInt();

        area = (base * altura)/2;

        System.out.println("A area do triangulo e: " + area);
    }
}