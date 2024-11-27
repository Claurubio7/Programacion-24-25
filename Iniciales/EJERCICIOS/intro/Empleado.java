import java.util.Scanner;

public class Empleado {
    public static int cargo;
    public static int diasViaje;
    public static int estadoCivil;
    public static double sueldoBase = 0;
    public static double dietas = 0;
    public static double porcentajeIRPF = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("\n *** NOMINAS *** \n");
        Empleado.datosEmpleados();
        Empleado.calcularSueldo();
        Empleado.sueldo();
    }

    public static void datosEmpleados(){
        System.out.println("Cargo de Empleados: \n" + "1-Programador Junior \n" + "2-Programador Senior \n" + "3-Jefe de Proyecto \n");
        System.out.print("Introduzca el cargo del Empleado (1-3): ");
        cargo = sc.nextInt(); 
        System.out.println("\n¿Cuántos días ha estado de viaje visitando clientes?");
        diasViaje = sc.nextInt();
        System.out.print("\n 1- Soltero"+ "\n 2- Casado \n");
        System.out.print("Introduzca su estado civil(1-2): ");
        estadoCivil = sc.nextInt();
    }

    public static void calcularSueldo(){

        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2: 
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                System.out.println("Cargo no válido");
            return;
        }

        dietas = diasViaje * 30;
        
        if (estadoCivil == 1) {
            porcentajeIRPF = 0.25;
        }else if (estadoCivil == 2) {
            porcentajeIRPF = 0.20;
        }else {
            System.out.println("Estado civil no válido");
            return;
        }

    }

    public static void sueldo (){
        double sueldoBruto = sueldoBase + dietas;
        double retenciónIRPF = sueldoBruto * porcentajeIRPF;
        double sueldoNeto = sueldoBruto - retenciónIRPF;

        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("| Sueldo base " + sueldoBase);
        System.out.println("| Dietas " + dietas);
        System.out.println("|-------------------------------|");
        System.out.println("| Sueldo bruto " + sueldoBruto);
        System.out.println("| Retención IRPF " + retenciónIRPF);
        System.out.println("|-------------------------------|");
        System.out.println("| Sueldo neto " + sueldoNeto);
        System.out.println("--------------------------------");
        System.out.println("");
    }
}