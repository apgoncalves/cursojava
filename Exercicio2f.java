import java.util.Scanner;

public class Exercicio2f {
    public static void main(String args[]) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int altura, largura, profundidade, volume;

        System.out.println("Digite o valor da altura: ");
        altura = keyboard.nextInt();

        System.out.println("Digite o valor da largura: ");
        largura = keyboard.nextInt();

        System.out.println("Digite o valor da profundidade: ");
        profundidade = keyboard.nextInt();

        volume = (altura * largura * profundidade);

        System.out.println("O volume do paralelepipedo e: " + volume);
    }
}