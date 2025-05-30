
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        /*
        Confeccionar un programa que pida por teclado tres notas de un alumno,
        calcule el promedio e imprima alguno de estos mensajes:
        Si el promedio es >=7 mostrar "Promocionado".
        Si el promedio es >=4 y <7 mostrar "Regular".
        Si el promedio es <4 mostrar "Reprobado".
        */
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese la primera nota: ");
        double nota1 = input.nextDouble();
        System.out.print("ingrese la segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.print("ingrese la tercera nota: ");
        double nota3 = input.nextDouble();

        input.close();

        double suma = nota1 + nota2 + nota3;
        double promedio = suma/3;

        if (promedio>=7 && promedio<=10) {
            System.out.println("promocionado " + promedio);
        } else {
            if (promedio>=4 && promedio<7) {
                System.out.println("regular " + promedio);
            } else {
                if (promedio<4 && promedio>=0) {
                    System.out.println("reprobado " + promedio);
                } else {
                    System.out.println("el promedio no coincide?? " + promedio);
                }
            }
        }
        

    }
}
