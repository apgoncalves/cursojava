import java.util.Scanner;

public class URI1064 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,countt;
        float valor,valorMult,media;

        countt = 0;
        valorMult = 0;


        for(count = 1; count <=6; count++) {
            valor = keyboard.nextFloat();
            if(valor > 0) {
                countt += 1;
                valorMult += valor;
            }
        }
        media = valorMult / countt;
        System.out.println(countt+" valores positivos");
        System.out.printf("%.1f\n",media);
    }
}