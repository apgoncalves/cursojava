import java.util.Scanner;

public class URI1067 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,countt,X;

        X = keyboard.nextInt();

        for(count = 1; count <= X; count++) {
            if(count % 2 != 0) {
                System.out.println(count);
            }
        }

    }
}