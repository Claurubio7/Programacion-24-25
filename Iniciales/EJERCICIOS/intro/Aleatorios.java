package intro;

import java.util.Scanner;

public class Aleatorios {
    public static Scanner entrada =  new Scanner(System.in);


    public static void main(String[] args) {

        Aleatorios.ejercicicio11();
    }
    

    public static void ejercicicio11(){
        int suspensos =  0;
        int aprobados = 0;
        int suficientes = 0;
        int bien = 0;
        int notables = 0;
        int sobresalientes = 0;
        int honor = 0; 
        double nota = 0;
        for(int i=0; i<=20; i++){
            nota = Math.random()*10 + 1;
            nota = Math.round(nota*100.00)/100.00;
            System.out.print(nota + " ");
            if (nota<5) {
                suspensos++;
            }else if(nota>=5){
                aprobados++;
                if ((nota>=5) && (nota<6)) {
                    suficientes++;
                }else if ((nota>=6) && (nota<7)){
                    bien++;
                }else if ((nota>=7) && (nota<9)){
                    notables++;
                }else if ((nota>=9) && (nota<10)){
                    sobresalientes++;
                }else{
                    honor++;
                }
            }
        }
        System.out.println("");
        System.out.println("\nSuspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suficientes: " + suficientes);
        System.out.println("Bien: " + bien);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresaliente:" + sobresalientes);
        System.out.println("Matricula de Honor: " + honor);
    }
}
