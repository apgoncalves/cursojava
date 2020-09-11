import java.util.Scanner;

public class URI1154 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,X,total;
        float media;

        count = 0;
        total = 0;

        do {
            X = keyboard.nextInt();
            if(X > 0) {
                count += X;
                total ++;
            }
        } while(X > 0);
        media = (float)count / total;
        System.out.printf("%.2f\n",media);
    }
}