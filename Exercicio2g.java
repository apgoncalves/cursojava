import java.util.Scanner;

public class Exercicio2g {
    public static void main(String args[]) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int lado1, lado2, lado3, volume;

        System.out.println("Digite o valor do lado1: ");
        lado1 = keyboard.nextInt();

        System.out.println("Digite o valor do lado2: ");
        lado2 = keyboard.nextInt();

        System.out.println("Digite o valor do lado3: ");
        lado3 = keyboard.nextInt();

        volume = (lado1 * lado2 * lado3);

        System.out.println("O volume do cubo e: " + volume);
    }
}