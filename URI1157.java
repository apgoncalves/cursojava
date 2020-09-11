import java.util.Scanner;
public class URI1157 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int N,count;

        N = keyboard.nextInt();

        for (count = 1; count <= N; count++) {
            if(N % count == 0) {
                System.out.println(count);
            }
        }
    }
}