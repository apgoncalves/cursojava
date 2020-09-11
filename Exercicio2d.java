import java.util.Scanner;

public class Exercicio2d {
    public static void main(String args[]) {
       
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int diagonal1, diagonal2, area;

        System.out.println("Digite o Valor da diagonal1 do losango:");
        diagonal1 = keyboard.nextInt();

        System.out.println("Digite o Valor da diagonal2 do losango:");
        diagonal2 = keyboard.nextInt();

        area = diagonal1 * diagonal2;

        System.out.println("A area do losango e: " + area);
    }
}