import java.util.Scanner;

public class URI1142 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,count1,count2,count3,X,loop,odd;

        X = keyboard.nextInt();
        loop = (X * 3);
        count1 = 0;
        count2 = 0;
        count3 = 0;

        for(count = 1; count <= X; count++) {
            count1 += 1;
            count2 = count1 + 1;
            count3 = count2 + 1;
            System.out.println(count1+" "+count2+" "+count3+" PUM");

            count1 = count3 + 1;
        }

    }
}