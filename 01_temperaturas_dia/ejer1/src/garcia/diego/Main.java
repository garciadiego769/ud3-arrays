package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] temperatura;
        temperatura = new double[3];
        double min = 9999;
        double max = -9999;
        double suma = 0;
        double media = 0;

        /* Inicializamos el array asignandole 0 a todos sus valores */

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce temperatura:");
            temperatura[i] = Double.parseDouble(br.readLine());
            /* vamos almacenando el max y el min */
            if (temperatura[i] < min) {
                min = temperatura[i];
            } else if (temperatura[i] > max) {
                max = temperatura[i];
            }
        }
        /* mostrar menú */
        for (int i = 0; i < temperatura.length; i++) {
            System.out.print(i);

            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print(" *");
            }
            System.out.print("  " + temperatura[i]);

            if (temperatura[i] == max) {
                System.out.print(" --> MAX");
            } else if (temperatura[i] == min) {
                System.out.print(" --> MIN");
            }
            System.out.println();

            suma = suma + temperatura[i];

        }
        media = suma / 3;
        System.out.println("MEDIA: " + media);

    }
}
