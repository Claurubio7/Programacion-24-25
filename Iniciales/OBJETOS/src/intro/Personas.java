 import java.util.Scanner;

public class Personas {
    //Pedir el nombre y edad de dos personas e indique quien es mayor
    //Propiedades a NIVEL DE CLASE SON ACCESIBLES a TODOS LOS MÉTODOS DE ESTA CLASE

    public static String nombre1;
    public static String nombre2;
    public static int edad1;
    public static int edad2;


    public static void main(String[] args) {
        //nombre1, nombre2, edad1, edad2 se declaran a NIVEL DE MÉTODO
       //El valor de estas variables solo son ACCESIBLES al método main

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre de la primera persona: ");
        Personas.nombre1 = sc.nextLine();
        System.out.print("Introduce la edad de " + nombre1 + " : ");
        Personas.edad1 = Integer.parseInt(sc.nextLine());
        

        System.out.print("Introduce el nombre de la segunda persona: ");
        Personas.nombre2 = sc.nextLine();
        System.out.print("Introduce la edad de " + nombre2 + " : ");
        Personas.edad2  = Integer.parseInt(sc.nextLine());
       
        System.out.println("---------------------------------");


        //Llamar o invocar al método estático que es mayor
        //esMayor(edad);//llamar la clase directamente
        Personas.esMayor();
       
    
    }

    public static void esMayor(){
       

        if (Personas.edad1 > Personas.edad2) {
            System.out.println(Personas.nombre1 + " es mayor que " + Personas.nombre2);
        }else if (Personas.edad1 == Personas.edad2) {
            System.out.println(Personas.nombre1 + " tiene la misma edad que " + Personas.nombre2);
        } else{
            System.out.println(Personas.nombre2 + " es mayor que " + Personas.nombre1);
        }
          
    }

    
}

