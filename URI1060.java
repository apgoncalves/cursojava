import java.util.Scanner;

public class URI1060 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,countt;
        float valor;

        countt = 0;


        for(count = 1; count <=6; count++) {
            valor = keyboard.nextFloat();
            if(valor > 0) {
                countt += 1;
            }
        }
        System.out.println(countt+" valores positivos");
    }
}