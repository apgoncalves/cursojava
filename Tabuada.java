import java.util.Scanner;

public class Tabuada {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int valor,count;

        System.out.println("Digite o valor: ");
        valor = keyboard.nextInt();

        count = 1;

        while(count <=9) {
            System.out.println(valor + "x" + count+ "=" + (valor * count));
            count += 1;
        }
    }
}