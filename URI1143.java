import java.util.Scanner;

public class URI1143 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,n1,n2,n3,X,loop;

        X = keyboard.nextInt();

        n1 = 0;
        n2 = 0;
        n3 = 0;

        for(count = 1; count <= X; count++) {
            n1 = count;
            n2 = n1 * n1;
            n3 = n2 * n1;
            System.out.println(n1+" "+n2+" "+n3);
        }

    }
}