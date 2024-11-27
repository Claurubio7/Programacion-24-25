package poo;
import java.util.Scanner;
import poo.Vehiculo;

public class Main {
    public static int NVEHICULOS = 5;
    public static Scanner entrada = new Scanner(System.in);
    public static Vehiculo[] vehiculos = new Vehiculo[NVEHICULOS];
    public static void main (String[] args){        
        String marca; String modelo; int velocidad;

        // *************** ENTRADA DE DATOS ************

        for(int i=0; i<NVEHICULOS; i++){
            System.out.print("Marca vehiculos " + (i+1) + " : ");
            marca = entrada.next();
            System.out.print("Modelo vehiculos " + (i+1) + " : ");
            modelo = entrada.next();
            System.out.print("Velocidad vehiculos " + (i+1) + " : ");
            velocidad = entrada.nextInt();
            vehiculos[i] = new Vehiculo(marca, modelo, velocidad);
            System.out.println();
        }

        for(int i=0; i<NVEHICULOS; i++){
            System.out.println(vehiculos[i]);
        }

        // Vehiculo v1 = new Vehiculo("peugeot", "3008", 90);
        // Vehiculo v2 = new Vehiculo("AuDi", "A3", 260);
        // Vehiculo v3 = new Vehiculo("Mercedes", "CLA", 280);


        //crear objeto o instancia
        // Vehiculo v1 = new Vehiculo();
        // v1.setMarca("Peugeot");
        // v1.setModelo("206");
        // Vehiculo v2 = new Vehiculo();
        // v2.setMarca("Audi");
        // v2.setModelo("A3");

        // // System.out.println("Vehiculo1: " + v1.getMarca() + " " + v1.getModelo());
        // // System.out.println("Vehiculo2: " + v2.getMarca() + " " + v2.getModelo());
        // v1.Info();
        // v2.Info();
        // System.out.println(v1);
        // System.out.println(v2);

    }
}