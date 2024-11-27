package arrays;
import java.util.Scanner;

public class unaDim {

    public static Scanner entrada = new Scanner(System.in); 
    static int ALUMNOS = 5;
    static int ASIGNATURAS = 4;
    static int TRIMESTRES = 2;
    static String[] alumnos = new String[ALUMNOS];
    //static String[] alumnos = {"Jose", "Ana", "Maria", "Luis", "Nohelia"};

    public static void main(String[] args) {

       //generar 10 notas aleatorias con dos decimales
       unaDim.pedirNombres();
       unaDim.generarNotas();
       
       //leer ALUMNOS notas por teclado
       //unaDim.notasTeclado();
    }

    public static void pedirNombres(){
        for(int i=0; i<unaDim.ALUMNOS; i++){
            System.out.print("Nombre Alumno " + i + ": ");
            unaDim.alumnos[i] = unaDim.entrada.next();
        }
        
    }

    public static void generarNotas(){
        double notas[] = new double[ALUMNOS];
        double temp = 0.0;
        double max = 0; int pmax = 0;  int pmin = 0;
        double min = 0;
        double media = 0;
        System.out.println("----- Generación de Notas ------");
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
        // System.out.println("Max :  " + max);
        // System.out.println("Min :  " + min);
        System.out.println("");
        media = media / ALUMNOS;
        System.out.print("Media : " + media + "\n");
        System.out.println("\nMax :  " + max + " y es de " + unaDim.alumnos[pmax]);
        System.out.println("Min :  " + min + " y es de " + unaDim.alumnos[pmin] + "\n");
        
    }


    public static void notasTeclado(){
        
        int[] notas = new int[ALUMNOS]; //0..4 indice's del array
        System.out.println("----- Lectura de Notas ------");
        for (int i = 0; i<ALUMNOS; i++){ //0..5 indice del for
            System.out.print("Introduce nota " + i + " : ");
            notas[i] = unaDim.entrada.nextInt();
        }
        System.out.println("----- Impresion de Notas ------");
        for (int i = 0; i<ALUMNOS; i++){
            System.out.print("nota " + i + " : " + notas[i]);
        }

    }


    // public static void notasTeclado(){
    //     int[] notas = new int[5]; // 0 ... 4 indice del array
    //     System.out.println("-------------- Lecturas de Notas -------------");
    //     for(int i = 0; i<5; i++){ // 0 ... 5 indica del for
    //         System.out.print("Introduce nota " +  i + " : ");
    //         notas[i] = unaDim.entrada.nextInt();
    //     }
    //     System.out.println("--------------- Impresión de Notas -------------");
    //     for(int i = 0; i<5; i++){
    //         System.out.print("    nota " + i + " : " + notas[i]);
    //     }
    // }



    public static void explicacion(){
         //almacenar array de notas con 2 enteros de 10 alumnos
         int nota = 9;//variable monovaluada (2 bytes)
         //notas --> (array [] --> v. multivaluada)
         //se usa el operador new() --> Reserva en tiempo compilación 10 posiciones 
         //ENTERAS de memoria RAM int --> 2 bytes --> notas ocupa 20 bytes
         //------- DECALARACION DE ARRAY (NO INIALIZADO)
         int[] notas = new int[10]; // notas[0] ... notas[9] {0, ..., 0}
         // int[] notas1 = {2,5,7,1,6,8,9,10,0,4};// Aquí ya se están asignando los valores
 
         //Una dimensión
         // notas[0] = 3;
         // notas[1] = 5;
         // notas[2] = 5;
         // notas[3] = 8;
         // notas[9] = 4;
         // System.out.println("Nota 1 alumno: " + notas[0]);
         // System.out.println("Nota 4 alumno: " + notas[3]);
         // System.out.println("Nota 9 alumno: " + notas[9]);
         // System.out.println("alumno 5 : " + notas[4]);
 
         //arary 2D Bidimensional (alumnos/asignaturas)
         // int[][] notas2 = new int[4][5];// 5 filas y 6 columnas
         // notas2[0][0] = 3;
         // //...
         // notas2[0][4] = 7;
         // notas2[1][0] = 6;
         // //...
         // notas2[1][4] = 7;
         // //...
         // notas2[3][0] = 3;
         // notas2[3][4] = 7;
 
          //arary 3D Tridimensional (cubo) (alumnos/asignaturas/trimestres)
          int[][][] notas3 = new int[4][5][2];// 5f, 6c, 3profundidad
          int[][][] notas4 = new int[ALUMNOS][ASIGNATURAS][TRIMESTRES];
          notas3 [2][1][2] = 5;
    }

}