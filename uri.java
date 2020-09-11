import java.util.Scanner;

public class uri {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        double A,B,C,areaTriangulo,areaTrapezio,areaQuadrado,areaRetangulo,areaCirculo,PI;

        A = keyboard.nextDouble();
        B = keyboard.nextDouble();
        C = keyboard.nextDouble();
        PI = 3.14159;


        areaTriangulo = ((A * C) / 2);
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = (B * B);
        areaRetangulo = (A * B);
        areaCirculo = (C * C * PI);

        System.out.printf("TRIANGULO: %.3f\n",areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n",areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n",areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n",areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n",areaRetangulo);
        
    }
}