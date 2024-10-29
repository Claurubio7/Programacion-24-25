import java.util.Scanner;

public class Ejercicio15 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca el valor de la base: ");
        double base = Double.parseDouble(System.console().readLine());
    }
    public static int base(int n){
        int base = 0;
        for(int i=0; i<=n; i++){
            System.out.println("Escribe el valor de la base: " + i);
        }
        return base;
    }
}
