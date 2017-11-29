package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] matriz = new int [3][3];
        
        /*inicializamos la matriz a 0 */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Introduce nº:");
                matriz[i][j]=Integer.parseInt(br.readLine());


            }
           
        }
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
