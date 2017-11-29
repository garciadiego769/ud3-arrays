package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int aleatorio = r.nextInt(100);

        int matriz [][] = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=aleatorio;
                System.out.format("%d ",matriz[i][j]);
            }
            System.out.println();

        }
    }
}
