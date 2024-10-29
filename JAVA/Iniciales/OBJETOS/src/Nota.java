import java.util.Scanner;

public class Nota {

    // Método para obtener la calificación según la nota numérica
    public static String obtenerCalificacion(double nota) {
        if (nota < 5) {
            return "Suspenso";
        } else if (nota >= 5 && nota < 6) {
            return "Aprobado";
        } else if (nota >= 6 && nota < 7) {
            return "Bien";
        } else if (nota >= 7 && nota < 9) {
            return "Sobresaliente";
        } else if (nota == 10) {
            return "Matrícula de Honor";
        } else {
            return "Nota no válida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreAlumno, nombreModulo;
        double nota;
        char continuar;
        
        // Solicitar el nombre del alumno
        System.out.print("Nombre del Alumno: ");
        nombreAlumno = scanner.nextLine();
        
        do {
            // Solicitar el nombre del módulo
            System.out.println("Escoja uno de los módulos disponibles:");
            System.out.println("1. Programación");
            System.out.println("2. LMSG");
            System.out.println("3. SGBD");
            System.out.println("4. Sistemas Informáticos");
            System.out.println("5. Entornos de Desarrollo");
            System.out.print("Número del Módulo: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del entero
            
            // Convertir el número del módulo a su nombre correspondiente
            switch (opcion) {
                case 1:
                    nombreModulo = "Programación";
                    break;
                case 2:
                    nombreModulo = "LMSG";
                    break;
                case 3:
                    nombreModulo = "SGBD";
                    break;
                case 4:
                    nombreModulo = "Sistemas Informáticos";
                    break;
                case 5:
                    nombreModulo = "Entornos de Desarrollo";
                    break;
                default:
                    System.out.println("Opción no válida, seleccionando Programación por defecto.");
                    nombreModulo = "Programación";
                    break;
            }
            
            // Solicitar la nota del alumno en el módulo
            System.out.print("Nota de " + nombreAlumno + " en " + nombreModulo + ": ");
            nota = scanner.nextDouble();

            // Mostrar el resultado con la calificación
            System.out.println(nombreAlumno + " tiene un " + nota + " en " + nombreModulo + " → " + obtenerCalificacion(nota));
            
            // Preguntar si se desean introducir más notas
            System.out.print("¿Desea introducir más notas? (S/N): ");
            continuar = scanner.next().charAt(0);
            scanner.nextLine();  // Consumir el salto de línea
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
