package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int turno = 0; /* a quien le toca*/
        int tiradas = 0;
        int fila;
        int columna;
        String gana = "";
        /*creamos la matriz (el tablero) */
        int[][] m1 = new int[3][3];

        /*la inicializamos */
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = 8;
            }
        }

        do {
            /* mostramos el tablero*/
            visualizartablero(m1);

            // Pedir las coordenadas
            do {
                System.out.println("Introduce posicion fila (0-2): ");
                fila = Integer.parseInt(br.readLine());
            } while (!(fila == 0 || fila == 1 || fila == 2));

            do {
                System.out.println("Introduce posicion columna (0-2):");
                columna = Integer.parseInt(br.readLine());
            } while (!(columna == 0 || columna == 1 || columna == 2 || columna == 3));

            // Comprobar si el hueco está libre
            if (m1[fila][columna] == 8) { //Está libre

                m1[fila][columna] = turno; //Escribimos un 0 o 1 (el turno de cada jugador)

                if (comprobarganador(m1, turno)) {
                    System.out.println("¡ENHORABUENA!");
                } else {
                    if (turno == 1) {
                        turno = 0;
                    } else {
                        turno = 1;
                    }
                }
                tiradas += 1;
            } else {
                //Si no está libre...
                System.out.println("Casilla ocupada, prueba otra vez");
            }


        } while (tiradas < 9 && !comprobarganador(m1, turno));


    }

    private static void visualizartablero(int[][] m1) {
        /*lo mostramos */
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.printf("%d ", m1[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean comprobarganador(int[][] m1, int turno) {
        boolean r = false;/*
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                switch(m1[i][j]){
                    case (m1[0][0]==0 && m1[0][1]==0 && m1[0][2]==0):
                        r=1;
                        break;
                }*/ /*Hacemos las comprobaciones */
        /*Jugador 1 */
        if (m1[0][0] == 0 && m1[0][1] == 0 && m1[0][2] == 0) {
            r = true;
        }
        if (m1[1][0] == 0 && m1[1][1] == 0 && m1[1][2] == 0) {
            r = true;
        }
        if (m1[2][0] == 0 && m1[2][1] == 0 && m1[2][2] == 0) {
            r = true;
        }
        if (m1[0][0] == 0 && m1[1][0] == 0 && m1[2][0] == 0) {
            r = true;
        }
        if (m1[0][1] == 0 && m1[1][1] == 0 && m1[2][1] == 0) {
            r = true;
        }
        if (m1[0][2] == 0 && m1[1][2] == 0 && m1[2][2] == 0) {
            r = true;
        }
        if (m1[0][2] == 0 && m1[1][1] == 0 && m1[2][0] == 0) {
            r = true;
        }
        if (m1[0][0] == 0 && m1[1][1] == 0 && m1[2][2] == 0) {
            r = true;
        }
        return r;
    }


}

