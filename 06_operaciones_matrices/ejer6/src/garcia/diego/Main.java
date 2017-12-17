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
        char opcion;

        //Generar las matrices
        int m1[][] = new int[4][4];
        int m2[][] = new int[4][4];
        // llenar matrices
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = r.nextInt(100);
                m2[i][j] = r.nextInt(100);

            }
        }

        visualizar(m1);
        visualizar(m2);

        //Menú
        do {
            System.out.println("OPERACIONES DISPONIBLES");
            System.out.println("-----------------------");
            System.out.println("a) Suma");
            System.out.println("b) Producto de un escalar");
            System.out.println("c) Producto");
            System.out.println("d) Respuesta");
            System.out.println("e) Salir");

            opcion = br.readLine().charAt(0);

            switch (opcion) {
                case 'a':
                    visualizar(sumarmatrices(m1, m2));
                    break;
                case 'b':
                    System.out.println("Escribe nº: ");
                    int n = Integer.parseInt(br.readLine());

                    visualizar(productoPorEscalar(m1, n));
                    break;
                case 'c':
                    visualizar(ProductoMatricial(m1, m2));
                    break;
                case 'd':
                    visualizar(traspuesta(m1));
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (opcion != 'e');


    }

    private static int[][] ProductoMatricial(int[][] m1, int[][] m2) {
        int[][] r = new int[4][4];
        return r;
    }

    private static int[][] productoPorEscalar(int[][] m1, int n) {
        int[][] r = new int[4][4];
        return r;
    }


    private static int[][] traspuesta(int[][] matriz) {
        int[][] r = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.format("%d ", matriz[i][j]);

            }

        }
        return r;
    }


    private static void visualizar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.format("%d ", m[i][j]);

            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] sumarmatrices(int[][] matriz, int[][] matriz2) {
        int[][] r = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                r[i][j] = matriz[i][j] + matriz2[i][j];
            }

        }
        return r;
    }


}
