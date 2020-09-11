import java.util.Scanner;

public class URI1073 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,N,loop,odd,sq;
        float valor,even;

        N = keyboard.nextInt();

        for(count = 1; count <= N; count++) {
            if(count % 2 == 0) {
                sq = count * count;
                System.out.println(count+"^"+count+" = "+sq);
            }
        }
    }
}