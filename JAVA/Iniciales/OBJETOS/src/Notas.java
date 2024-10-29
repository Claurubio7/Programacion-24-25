import java.util.Scanner;

public class Notas {

    public static Scanner sc = new Scanner(System.in);
    public static double nota;
    public static String modulo;

    public static void main(String[] args){
    
        System.out.print("Introduzca el nombre del alumno: ");
        String alumno = Notas.sc.nextLine(); 

        System.out.println("\n" + " *** NOTAS DE ALUMNOS *** " + "\n");
        Notas.nombreAlumno();        
        Notas.modulos();

    }

    public static void nombreModulos() {
    
        System.out.println(" \n Escoja uno de los módulos disponibles:");
        System.out.println("1. Programación");
        System.out.println("2. LMSG");
        System.out.println("3. SGBD");
        System.out.println("4. Sistemas Informáticos");
        System.out.println("5. Entornos de Desarrollo");
        System.out.print("Número del Módulo: ");
        modulo = Notas.sc.nextLine();
        System.out.print("Introduzca la nota de " + alumno + " en " + modulo + ": ");
        nota = Notas.sc.nextDouble();
        
    }

    public static void modulos(){

        int opcion;
        char respuesta;
        boolean continuar = true;

        if (nota < 5) {
            System.out.println("Suspenso");;
        }else if (nota >= 5 && nota <= 6) {
            System.out.println("Aprobado");
        }else if (nota < 6 && nota <= 7) {
            System.out.println("Bien"); 
        }else if (nota < 7 && nota >= 9) {
           System.out.println("Sobresaliente");
        }else if (nota == 10){
           System.out.println("Matrícula de Honor");
        }else {
            System.out.println("Nota no válida");
        }

        while (continuar) {
            Notas.nombreModulos();
            opcion = Notas.sc.nextInt();

            switch (opcion){
                case 1:
                    modulo = "Programación";
                    break;//sale del switch --> no sigue comparando casos
                case 2:
                    modulo = "LMSG";
                    break;
                case 3:
                    modulo = "Sistemas Informáticos";
                    break;
                case 4:
                    modulo = "SGBD";
                    break;
                case 5:
                    modulo = "Entorno de desarrollos";
                    break;
                default:
                    System.out.println("No hay más Figuras ... ");
                    
            }//switch

            System.out.print("¿Desea continuar S/N?: ");
            respuesta = Notas.sc.next().toUpperCase().charAt(0);
            //if ((respuesta == 'N') && (respuesta == 'n')) //or and
            if (respuesta == 'N') {
                continuar = false;
            }
        }//while
        
    }

   
    
}
