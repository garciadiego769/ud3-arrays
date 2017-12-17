package garcia.diego;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] preguntas = new String [4]; //Nº de preguntas
        String [] respuestas = new String [4]; //Nº de respuestas
        String respuestaUsuario=" ";
        Random r=new Random();
        int correctas=0;
        int incorrectas=0;
        String respuesta="";

        /*Inicializamos las preguntas */
        preguntas[0]="Cuantos dias son una semana?";
        preguntas[1]="Cuantos meses son un año?";
        preguntas[2]="De que color es la hierba?";
        preguntas[3]="Que marca tiene como logo unas alas?";
        // Inicializamos respuestas
        respuestas[0]="7"; //Cuantos dias son una semana?
        respuestas[1]="12"; //Cuantos meses son un año?
        respuestas[2]="verde";//De que color es la hierba?
        respuestas[3]="nike"; //Que marca tiene como logo unas alas?

        do{
            int aleatorio=r.nextInt(preguntas.length);
            System.out.println("Pregunta: "+preguntas[aleatorio]);
            respuesta=br.readLine();
            System.out.println("La respuesta es: "+respuestas[aleatorio]);
            System.out.println("¿Has acertado? (si no)");
            respuestaUsuario=br.readLine();
            if (respuestaUsuario.equalsIgnoreCase("si")) {

                correctas++;
            }
            else {
                incorrectas++;
            }
            System.out.println("¿Quieres continuar?");
            respuestaUsuario=br.readLine();

        } while(!respuestaUsuario.equalsIgnoreCase("no"));
        System.out.println("Correctas: "+correctas);
        System.out.println("Incorrectas: "+incorrectas);

    }
}
