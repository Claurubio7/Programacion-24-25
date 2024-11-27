package arrays;

import java.util.Scanner;

public class temperatura {
    public static Scanner entrada = new Scanner(System.in);
    static int CIUDADES = 5;
    static String[] temperaturas = new String[CIUDADES];

    public static void main(String[] args) {
    }

    public static void generarNotas(){
        double temp = 0.0;
        double max = 0; int pmax = 0;  int pmin = 0;
        double min = 0;
        double media = 0;
        System.out.println("----- Generación de Temperaturas ------");
        for (int i=0; i<unaDim.ALUMNOS; i++){
            temp = Math.random()*10;
            temp = Math.round(temp*100.00)/100.00;
            notas[i] = temp;
        }
        System.out.println("----- Impresion de Notas ------");
        for (int i = 0; i<unaDim.ALUMNOS; i++){
            System.out.println("nota " + unaDim.alumnos[i] + " : " + notas[i]);
        }
        System.out.println("----- Informes de Resultados --------");
        //suposicion
        max = notas[0];
        min = notas[0];
        //Supungo que se alcanza en la posisción 0
        pmax = 0;
        pmin = 0;
        for (int i=0; i<unaDim.ALUMNOS; i++){
            media = media + notas[i];
            if (notas[i]>max){
                max = notas[i];
                pmax = i;
            }
            if (notas[i]<min){
                min = notas[i];
                pmin = i;
            }
        }
        System.out.println("Max :  " + max);
        System.out.println("Min :  " + min);
        media = media / ALUMNOS;
        System.out.println("Media : " + media);

        System.out.println("\nMax :  " + max + " y es de " + unaDim.alumnos[pmax]);
        System.out.println("Min :  " + min + " y es de " + unaDim.alumnos[pmin]);
        
    }
}
