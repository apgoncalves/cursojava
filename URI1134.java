import java.util.Scanner;

public class URI1134 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);
        int totalGas,totalAlc,totalDies,end,N;
        totalGas = 0;
        totalAlc = 0;
        totalDies = 0;

        do {
            N = keyboard.nextInt();
            switch(N) {
                case 1:
                    totalAlc += 1;
                    break;
                case 2:
                    totalGas += 1;
                    break;
                case 3:
                    totalDies += 1;
                    break;
                default:
                    break;
            }
        }
        while(N != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+totalAlc);
        System.out.println("Gasolina: "+totalGas);
        System.out.println("Diesel: "+totalDies);
    }
}