//Clase principal de un proyecto java, por convenio.
public class App {
    int valor = 10;

    //Una clase contiene propiedades y métodos.
    //Propiedades --> variables de una clase
    //Método --> funciones de una clase.
    

    /*método o función main() y es el punto de entrada a nuestro proyecto.
    En el método main() comienza la ejecución de la clase.
    */
    public static void main(String[] args) throws Exception {
        //Creación de variables dentro de un método.
        int valor = 5;
        double comision = 15.5;
        String nombre = "Claudia Raquel";
        String apellidos = "Rubio Lazo";//Clase string de java --> métodos
        String ciudad = "Almería";//tipo básico cadena de caracteres
        String nombreCompleto;
        //nombreCompleto = nombre + apellidos;
        //nombreCompleto.concat(nombre).concat(" ").concat(apellidos);
        nombreCompleto = nombre.concat(" ").concat(apellidos);
        System.out.println("nombreCompleto = " + nombreCompleto.concat(" y eres de ").concat(ciudad));
        System.out.println("nombreCompleto = " + nombreCompleto.length());// cuenta los caracteres que tiene la cadena
        System.out.println("Nombre = " + nombreCompleto);
        System.out.println(("Viven en ").concat(ciudad));

        //mensaje de bienvenida por pantalla.
        // System.out.printf("%20s %10s %10s%n","Producto","Cantidad","Precio\n");
        // System.out.printf("%20s %10d %10.2f\n", "Portatil",10 ,1300.45);
        // System.out.printf("%20s %10d %10d\n","IPad 13Pro", 4, 2400);
        // System.out.printf("%20s %10d %10.2f\n","Iphone 14", 40, 1500.3);
        // System.out.printf("%20s %10d %10d\n","Samsung S24", 20, 729);
        // System.out.printf("%20s %10d %10.2f\n","Iphone 16", 30, 1119.98);


        // System.out.printf("El valor de la comisión es del %.5f euros%n", comision);
        // System.out.printf("El valor de la comisión es del %10.5f euros%n", comision);
        // System.out.printf("El valor de la comisión es del %-10.5f euros%n", comision);
        
        
    }

    private void calcularPeso(){

    }

    private double calcularPotencia(){
        //...
        return 31; 
    }
}

