import java.util.Scanner;

public class URI1047 {
    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        int in_hour,in_min,fin_hour,fin_min,duracao,tempo_in,tempo_fin,horas,minutos;

        in_hour  = keyboard.nextInt();
        in_min   = keyboard.nextInt();
        fin_hour = keyboard.nextInt();
        fin_min  = keyboard.nextInt();

        tempo_in = ((in_hour * 60) + in_min);
        tempo_fin = ((fin_hour * 60) + fin_min);

        duracao = (tempo_fin - tempo_in);

        if(duracao <= 0) {
            duracao = duracao + 1440;
        }
        horas = duracao/60;
        minutos = duracao%60;

        System.out.println("O JOGO DUROU "+horas+" HORA(S) E "+minutos+" MINUTO(S)");

    }
}