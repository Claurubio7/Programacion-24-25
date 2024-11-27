 import java.util.Scanner;

public class Persona {
    //Pedir el nombre y edad de dos personas e indique quien es mayor
    //Propiedades a NIVEL DE CLASE SON ACCESIBLES a TODOS LOS MÉTODOS DE ESTA CLASE

    // public static String nombre1;
    // public static String nombre2;
    // public static int edad1;
    // public static int edad2;


    public static void main(String[] args) {
        //nombre1, nombre2, edad1, edad2 se declaran a NIVEL DE MÉTODO
       //El valor de estsas variables solo son ACCESIBLES al método main
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre de la primera persona: ");
        String  nombre1 = sc.nextLine();
        //Persona.nombre1 = sc.nextLine();
        System.out.print("Introduce la edad de " + nombre1 + " : ");
        int edad1  = Integer.parseInt(sc.nextLine());
        //Persona.edad1 = Integer.parseInt(sc.nextLine());
        

        System.out.print("Introduce el nombre de la segunda persona: ");
        String  nombre2 = sc.nextLine();
        System.out.print("Introduce la edad de " + nombre2 + " : ");
        int edad2  = Integer.parseInt(sc.nextLine());
       
        System.out.println("---------------------------------");


        //Llamar o invocar al método estático que es mayor
        //esMayor(edad);//llamar la clase directamente
        Persona.esMayor(edad1, edad2, nombre1, nombre2);
        //Persona.esMayor(e1, e2, n1, n2);
    
    }


    public static void esMayor(int edad1, int edad2, String nombre1, String nombre2){
       

        if (edad1 > edad2) {
            System.out.println(nombre1 + " es mayor que " + nombre2);
        }else if (edad1 < edad2) {
            System.out.println(nombre2 + " es mayor que " + nombre1);
        } else{
            System.out.println(nombre1 + " y " + nombre2 + " tienen la misma edad");
        }
          
    }

    //Por eso estas nuevas variables se las pasamos al metodo main
    // public static void esMayor(int e1, int e2, String n1, String n2){
       

    //     if (Persona.edad1 > edad2) {
    //         System.out.println(nombre1 + " es mayor que " + nombre2);
    //     }else if (edad1 == edad2) {
    //         System.out.println(nombre1 + " tiene la misma edad que " + nombre2);
    //     } else{
    //         System.out.println(nombre2 + " es mayor que " + nombre1);
    //     }
          
    // }

    
}

