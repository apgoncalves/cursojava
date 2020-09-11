import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class URI1038v2 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        Map<int,float> myarray = new HashMap<int,float>();
        int x,y;
        float value;

        myarray.put( 1, new float[4.00 ]);

        x = keyboard.nextInt();
        y = keyboard.nextInt();

        if (myarray.containsKey(x)) {
            value = x * myarray.get(x); 
            System.out.printf("Total: R$ %.2f\n",value);
        }
        
    }
}