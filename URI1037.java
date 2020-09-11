import java.util.Scanner;

public class URI1037 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        float in,result;

        in = keyboard.nextFloat();

        if((in >= 0) && (in <= 25)) {
            System.out.println("Intervalo [0,25]");
        }
        else if((in >= 25) && (in <= 50)){
            System.out.printf("Intervalo (25,50]");
        }
        else if((in >= 50) && (in <= 75)){
            System.out.println("Intervalo (50,75]");
        }
        else if((in >= 75) && (in <= 100)){
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }

        
    }
}