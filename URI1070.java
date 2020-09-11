import java.util.Scanner;

public class URI1070 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,X,loop,odd;
        float valor,even;

        X = keyboard.nextInt();
        loop = (X + 11);

        for(count = X; count <= loop; count++) {
            if(count % 2 != 0) {
                System.out.println(count);
            }
        }
    }
}