import java.util.Scanner;

public class HappyHour {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        float hour;

        while(true) {
            System.out.println("Digite o Horario");
            hour = keyboard.nextFloat();
            if(hour > 18) {
                System.out.println("Happy Hour Liberado ;)");
            }
            else {
                System.out.println("Ainda e cedo pra Beber :(");
            }
        }
    }
}