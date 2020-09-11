import java.util.Scanner;

public class Exercicio2h {
    public static void main(String args[]) {
       
        Scanner keyboard = new Scanner(System.in);

        float raio, altura, area, pi, volume;

        System.out.println("Digite o Raio e altura do Cilindro: ");
        raio = keyboard.nextFloat();
        altura = keyboard.nextFloat();
        pi = 3.14f;

        volume = raio * raio * pi * altura;

        System.out.printf("O Volume e %.2f : ",volume);
    }
}