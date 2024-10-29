 import java.util.Scanner;

public class Lectura {
    //Lectura es una clase estática
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String  nombre = sc.nextLine();
        System.out.print("Introduce tu apellido: ");
        String apellidos = sc.nextLine();
        var nombreCompleto = nombre.concat(" ").concat(apellidos);
        System.out.print("Introduce tu ciudad: ");
        String ciudad = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad  = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------");
        System.out.println("Tu nombre completo es:  " + nombreCompleto);
        System.out.println("Tu ciudad es: " + ciudad);
        System.out.println("Tu edad es: " + edad);

        //Llamar o invocar al método estático que es mayor
        //esMayor(edad);//llamar la clase directamente
        Lectura.esMayor(edad);
        Lectura.getAnioNac(edad);
    }


    public static void esMayor(int edad){
        //Método estático de la clase lectura para saber si es o no mayor de edad
        if (edad >= 18) {
            System.out.println("Con la edad de " + edad + " años eres Mayor de edad");
        }else{
            System.out.println("Con la edad de " + edad + " años eres Menor de edad");
        }
    }

    public static void getAnioNac(int edad){
        int anio = 2024 - edad;
        System.out.println("Has nacido en el año: " + anio );
    }
    
}

