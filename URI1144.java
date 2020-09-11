import java.util.Scanner;

public class URI1144 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,n1,n2,n3,n4,n5,n6,X,loop;

        X = keyboard.nextInt();

        for(count = 1; count <= X; count++) {
            n1 = count;
            n2 = n1 * n1;
            n3 = n2 * n1;
            n5 = n2 + 1;
            n6 = n3 + 1; 
            System.out.println(n1+" "+n2+" "+n3);
            System.out.println(n1+" "+n5+" "+n6);
        }

    }
}