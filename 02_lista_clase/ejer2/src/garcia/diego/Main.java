package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String letra;
        String[] nombre;
        nombre = new String[19]; /*<-- nº alumnos */
        String muestra;

        /* pedimos los nombres*/
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Introduce nombre y apellido:");
            nombre[i] = br.readLine();
        }
        do {
            System.out.println("Introduce letra a buscar o FIN:");
            letra = br.readLine();
            /* si no escribe fin*/
            if (!letra.equalsIgnoreCase("fin")) { /*buscamos*/
                for (int i = 0; i < nombre.length; i++) {
                    if (letra.charAt(0) == nombre[i].charAt(0)) {
                        System.out.println(nombre[i]);
                    }
                }

            }
        } while (!letra.equalsIgnoreCase("fin"));


    }
}
