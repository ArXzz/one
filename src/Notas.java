import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.print("ingrese la primera nota: ");
        double nota1 = notas.nextDouble();
        System.out.print("ingrese la segunda nota: ");
        double nota2 = notas.nextDouble();
        System.out.print("ingrese la tercera nota: ");
        double nota3 = notas.nextDouble();

        double suma = nota1 + nota2 + nota3 ;
        double promedio = suma / 3;

        if (promedio>=7.0) {
            System.out.println("Promocionado");
        }
    }
}
