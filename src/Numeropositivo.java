import java.util.Scanner;
//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos
//un número entero)

public class Numeropositivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese un numero positivo de uno o dos digitos: ");
        int numero = input.nextInt();

        if (numero>=0 && numero<100) {
            if (numero<10) {
                System.out.println("el numero ingresado tiene un digito");
            } else {
              System.out.println("el numero ingresado tiene dos digitos");  
            }
        } else {
            System.out.println("el numero no cumple las condiciones dadas???");
        }

    }
}
