
import java.util.Scanner;

public class Numeromayor {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;
        //se introducen los numeros por consala.
        try ( //Creamos un Scanner.
                Scanner numeros = new Scanner(System.in)) {
            //se introducen los numeros por consala.
            System.out.println("Introduce tres numeros a continuacion: ");
            numero1 = numeros.nextInt();
            numero2 = numeros.nextInt();
            numero3 = numeros.nextInt();
            //Se cierra el scanner.
        }

        //Se agrega el condicional para obtener el resultado.
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("el numero mayor es: " + numero1);
        } else {
            if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("el numero mayor es: " + numero2);
            } else {
                if (numero3 > numero1 && numero3 > numero2) {
                    System.out.println("el numero mayor es: " + numero3);
                    
                } else {
                    System.out.println("Error no se encontro el numero mayor? ");
                }
            }
        }

    }
    
}
