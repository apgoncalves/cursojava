import java.util.Scanner;

public class URI1051 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        double salario,salarioLiq,imposto;

        salario = keyboard.nextDouble();

        if(salario <= 2000.00) {
            System.out.println("Isento");
        }
        else if(salario > 2000.0 && salario <= 3000.00) {
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f\n",imposto);
        }
        else if(salario <= 4500.00) {
            imposto = (salario - 3000.0) * 0.18 + 80.0;
            System.out.printf("R$ %.2f\n",imposto);
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 270.0 + 80.0;
            System.out.printf("R$ %.2f\n",imposto);
        }


    }
}