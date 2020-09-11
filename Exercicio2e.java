import java.util.Scanner;

public class Exercicio2e {
    public static void main(String args[]) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int base_maior, base_menor, altura, area;

        System.out.println("Digite o valor da Base Maior:");
        base_maior = keyboard.nextInt();

        System.out.println("Digite o valor da Base menor:");
        base_menor = keyboard.nextInt();

        System.out.println("Digite o valor da Altura:");
        altura = keyboard.nextInt();

        area = ((base_maior + base_menor) * altura) / 2;

        System.out.println("A area do trapezio e:" + area);
    }
}