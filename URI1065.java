import java.util.Scanner;

public class URI1065 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,countt;
        float valor,even,odd;

        countt = 0;

        for(count = 1; count <=5; count++) {
            valor = keyboard.nextFloat();
            if(valor % 2 == 0) {
                countt += 1;
            }
        }
        System.out.println(countt+" valores pares");
    }
}