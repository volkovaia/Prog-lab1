import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] arg) {
        int[] c = new int[10];
        for (int i = 0; i < 10; i++) {
            c[i] = i * 2 + 6;

        }
        //System.out.println(Arrays.toString(c));
        // System.out.println("Рандомные числа от -2.0 до 7.0: ");

        double [] x = new double[20];
        for (int i = 0; i < 20; i++) {
            x[i] = (Math.random()*9.0-2.0);   /* x = (Math.random()*((max-min)+1))+min */
            //System.out.println(x[i]);
        }
        // System.out.println("Двумерный массив: ");
        double[][] mass = new double[10][20];
        //DecimalFormat dF = new DecimalFormat( "#######.#####" );
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                if (c[i] == 6){
                    mass[i][j] = Math.pow(Math.asin(1/Math.pow(Math.E, Math.abs(x[j]))/Math.cos(Math.cbrt(x[j]))), 2); /*cbrt корень кубический */
                } else if (c[i] == 10 | c[i] == 16 | c[i] == 18 | c[i] == 22 | c[i] == 24){
                    mass[i][j] = (cos(cos(x[j])) - 4) / cos(x[j]*(pow((x[j]-PI), 3)));
                }else mass[i][j] = asin((pow(E, cbrt(-abs(asin(pow(E, -abs(x[j]))))))));
                System.out.printf ("%.5f ", (float)mass[i][j]);
            }
            System.out.println ("");
        }
    }
}





