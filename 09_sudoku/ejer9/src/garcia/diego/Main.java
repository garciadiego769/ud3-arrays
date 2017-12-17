package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] tablero = new int[9][9]; // Crear el tablero

        int fila;
        int columna;
        int valor=0;
        String respuesta="";
        // Inicializar tablero
        inicializartablero(tablero);
        do {
            // mostrar el tablero
            visualizartablero(tablero);

            do {
                // pedir fila, columna y datos al usuario
                System.out.println("Introduce fila (0-8):");
                 fila = Integer.parseInt(br.readLine());
            } while (fila<0 || fila>8);

            do {
                System.out.println("Itroduce columna (0-8): ");
                columna = Integer.parseInt(br.readLine());
            } while (columna<0 || columna>8);


                System.out.println("Introduce valor a introducir: ");
                respuesta = br.readLine();

                if(!respuesta.equalsIgnoreCase("fin")){ // Si NO escribe fin

                    valor=Integer.parseInt(respuesta);//hacemos la conversión

                    if(comprobarsitio(tablero,fila,columna) && comprobarcolumna(tablero,columna,valor) && comprobarfila(tablero,fila,valor) && comprobarcuadrado(tablero,fila,columna,valor)){ //si hay hueco y columna OK y fila OK y cuadrado OK...
                        tablero[fila][columna]=valor; //escribimos
                    }
                    else {
                        System.out.println("Casilla llena, escribe en otro sitio");
                        System.out.println();
                    }
                }


        } while (!lleno(tablero) || !respuesta.equalsIgnoreCase("fin"));/* se llena o escribe fin*/

    } // -----------

    private static boolean comprobarcuadrado(int[][] tablero, int fila, int columna, int valor) {
        boolean r=true;
        int f=0;
        int c=0;

       c=columna/3*3;
       f=fila/3*3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j]==0){
                    r=false;
                }
            }
        }
        return r;
    }

    private static boolean comprobarfila(int[][] tablero, int f,int valor) {
        boolean r=true;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[f].length; j++) {
                if(tablero[f][i]==valor){
                    r=false;
                }
            }
        }
        return r;
    }

    private static boolean comprobarcolumna(int[][] tablero, int c,int valor) {
        boolean r=true;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[c].length; j++) {
                if(tablero[i][c]==valor){ /*c: columna, i: fila*/
                    r=false;
                }
            }
        }
        return r;
    }

    private static boolean lleno(int[][] t) {
        boolean r=true;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if(t[i][j]==0){ //Comprueba una a una si están vacías (hay algún 0)
                    r=false;
                }
                else{
                    r=true;
                }
            }

        }
        return r;
    }

    private static boolean comprobarsitio(int[][] tablero, int f,int c) {

        if(tablero[f][c]==0){ //si tiene un 0 la posición, está libre
            return true;
        }
        else{
            return false;
        }

    }



    private static void inicializartablero(int[][] t) {
            t[0][0]=5;  t[0][1]=3;  t[0][4]=7;
            t[1][0]=6;  t[1][3]=1;  t[1][4]=9;  t[1][5]=5;
            t[2][1]=9;  t[2][2]=8;  t[2][7]=6;
            t[3][0]=8;  t[3][4]=6;  t[3][8]=3;
            t[4][0]=4;  t[4][3]=8;  t[4][5]=3;  t[4][8]=1;
            t[5][0]=7;  t[5][4]=2;  t[5][8]=6;
            t[6][1]=6;  t[6][6]=2;  t[6][7]=8;
            t[7][3]=4;  t[7][4]=1;  t[7][5]=9;  t[7][8]=5;
            t[8][5]=8;  t[8][7]=7;  t[8][8]=9;

    }

    private static void visualizartablero(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(" "+t[i][j]);
            }
            System.out.println();
        }
    }

}
