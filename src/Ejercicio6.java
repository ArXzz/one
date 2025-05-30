import java.util.Scanner;

public class Ejercicio6 {
    //Se ingresa por teclado un valor entero,
//mostrar una leyenda que indique si el número es positivo,
//negativo o nulo (es decir cero)
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("ingresa un numero entero: ");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("el numero es positivo");
        } else {
            if (numero == 0) {
                System.out.println("el numero es nulo");
            } else {
                System.out.println("el numero es negativo");
            }
        }
        input.close();

    }
}
