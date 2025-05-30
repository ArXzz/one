import java.util.Scanner;

public class Ejerciciobase1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ingrese el primer numero: ");
        int numero1 = input.nextInt();

        System.out.print("ingrese el segundo numero: ");
        int numero2 = input.nextInt();

        if (numero1>numero2) {
            int suma = numero1 + numero2;
            System.out.println("la suma es: " + suma);
            int diferencia = numero1 - numero2;
            System.out.println("la diferencia es: " + diferencia);
        } else {
            int producto = numero1 * numero2;
            System.out.println("el producto es : " + producto);
            if (numero2 != 0) {
                int divicion = numero1 / numero2;
                System.out.println("la divicion es: " + divicion);
            }else{
                System.out.println("no se puede dividir por cero!!!");
            }
            input.close();
        }
    }
}