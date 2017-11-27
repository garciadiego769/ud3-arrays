package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String palabra;


        System.out.print("Introduce palabra:");
        palabra = br.readLine().toUpperCase(); /*convertimos a may*/

        String abc = "ABCDEFGHIJKLMÑOPQRSTUVWXYZ";

        int[] recuento=new int[abc.length()];

        contarletras(palabra,abc,recuento);

        visualizarRecuento(abc,recuento);
    }

    private static void visualizarRecuento(String abc, int[] recuento) {

        for (int i = 0; i < recuento.length; i++) {
            if(recuento[i]>0){
                System.out.println(abc.charAt(i)+": "+recuento[i]);
            }
        }
    }

    private static void contarletras(String palabra, String abc, int[] recuento) {

        for (int i = 0; i < palabra.length(); i++) {
            char letra=palabra.charAt(i); /* Sacamos la letra */

            for (int j = 0; j < abc.length(); j++) {
                if(abc.charAt(j)==letra) /* Si encuentro coincidencia...*/
                    recuento[j]+=1;
            }

        }
    }


}
