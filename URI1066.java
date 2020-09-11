import java.util.Scanner;

public class URI1066 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int count,countt,valor,countPar,countImpar,countNeg,countPos;
        float even,odd;

        countPar = 0;
        countImpar = 0;
        countNeg = 0;
        countPos = 0;

        for(count = 1; count <=5; count++) {
            valor = keyboard.nextInt();
            if(valor % 2 == 0) {
                countPar += 1;
                if(valor > 0) {
                    countPos += 1;
                }
                else if (valor < 0) {
                    countNeg += 1;
                }
            }
            else if(valor % 2 != 0) {
                countImpar += 1;
                if(valor > 0) {
                    countPos += 1;
                }
                else if (valor < 0) {
                    countNeg += 1;
                }
            }
        }
        System.out.println(countPar+" valor(es) par(es)");
        System.out.println(countImpar+" valor(es) impar(es)");
        System.out.println(countPos+" valor(es) positivo(s)");
        System.out.println(countNeg+" valor(es) negativo(s)");
    }
}