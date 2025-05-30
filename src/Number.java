import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        //Realizar un programa que solicite ingresar
        //dos números distintos y muestre por pantalla el mayor de ellos.
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        float numero1 = input.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        float numero2 = input.nextFloat();

        if (numero1>numero2) {
            System.out.println("el numero mayor es el: " + numero1);
        } else {
            System.out.println("el numero mayor es el: " + numero2);
        }
    }
}
