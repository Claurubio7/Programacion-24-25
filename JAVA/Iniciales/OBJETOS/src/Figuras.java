import java.util.Scanner;;

public class Figuras {
    //Ejercicio 5 : Escribe un programa que calcule el área de un rectángulo.
    //Ejercicio 6 : Escribe un programa que calcule el área de un triángulo.
    //crear clase figura, métodos para obtener área cuadrado, area circulo y área pirámide

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + "*** FIGURAS ***" + "\n");

        Figuras.calcularAreaRectangulo(sc);
        Figuras.calcularAreaCuadrado(sc);
        Figuras.calcularAreaTriangulo(sc);
        Figuras.calcularAreaCirculo(sc);
        Figuras.calcularAreaPiramide(sc);
        
    }

    
    public static void calcularAreaRectangulo (Scanner sc){
        
        System.out.println("AREA RECTÁNGULO");
        System.out.print("Introduce la base del Rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del Rectángulo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        

        System.out.println("El área del Rectángulo es: " + area + "\n");

    }

    public static void calcularAreaCuadrado (Scanner sc){
        
        System.out.println("AREA CUADRADO");
        System.out.print("Introduce el lado del cuadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;

        System.out.println("El área del Cuadrado es: " + area + "\n");
        
    }

    public static void calcularAreaTriangulo (Scanner sc){
        
        System.out.println("AREA TRIÁNGULO");
        System.out.print("Introduce la base del Triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del Triángulo: ");
        double altura = sc.nextDouble();
        double area = base * altura / 2;

        System.out.println("El área del Triángulo es: " + area + "\n");

    }

    public static void calcularAreaCirculo (Scanner sc){
        
        System.out.println("AREA CIRCULO");
        System.out.print("Introduce el radio del circulo: ");
        double radio = sc.nextDouble();
        double area = Math.PI * radio * radio;

        System.out.println("El área del Circulo es: " + area + "\n");

    }

    public static void calcularAreaPiramide (Scanner sc){
        
        System.out.println("AREA PIRAMIDE");
        System.out.print("Introduce la base de la Pirámide: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura de la Pirámide: ");
        double altura = sc.nextDouble();
        double areaBase = base * base;
        double areaLateral = (base * altura / 2) * 4;
        double areaTotal = areaBase + areaLateral;

        System.out.println("El área de la Piramide es: " + areaTotal + "\n");
    
    }



    
    
}