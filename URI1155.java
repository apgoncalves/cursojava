import java.util.Scanner;
public class URI1155 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int N,count;
        float output;
        N = 2;
        output = 0;

        //N = keyboard.nextInt();

        for (count = 1; count <= 100; count++) {
            output += (1.0 / N);
            N++;
           
            
        }
        output += 1;
        System.out.printf("%.2f\n",output);
    }
}