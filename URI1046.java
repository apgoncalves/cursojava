import java.util.Scanner;

public class URI1046 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int start,end,day,result,duracao;

        start = keyboard.nextInt();
        end = keyboard.nextInt();
        day = 24;
        duracao = (end - start);

        if(duracao <= 0) {
            result = (duracao + 24);
        }
        else {
            result = duracao;
        }
        System.out.println("O JOGO DUROU "+result+" HORA(S)");
    }
}