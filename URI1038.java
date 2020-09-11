import java.util.Scanner;

public class URI1038 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x,y;
        float value;
        float opt1,opt2,opt3,opt4,opt5;

        x = keyboard.nextInt();
        y = keyboard.nextInt();
        opt1 = 4.00f;
        opt2 = 4.50f;
        opt3 = 5.00f;
        opt4 = 2.00f;
        opt5 = 1.50f;

        if (x == 1) {
            value = (y * opt1);
            System.out.printf("Total: R$ %.2f\n",value);
        }
        else if (x == 2) {
            value = (y * opt2);
            System.out.printf("Total: R$ %.2f\n",value);
        }
        else if (x == 3) {
            value = (y * opt3);
            System.out.printf("Total: R$ %.2f\n",value);
        }
        else if (x == 4) {
            value = (y * opt4);
            System.out.printf("Total: R$ %.2f\n",value);
        }
        else {
            value = (y * opt5);
            System.out.printf("Total: R$ %.2f\n",value);
        }
    }
}