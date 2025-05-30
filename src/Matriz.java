
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int suma = 0;

        System.out.println("ingrese el numero de filas: ");
        int filas = input.nextInt();
        System.out.println("ingrese el numero de columnas: ");
        int columnas = input.nextInt();
        int[][] matriz = new int[filas][columnas];

        int totalnumeros = filas * columnas;

        System.out.println("ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
          for (int j = 0; j < columnas; j++) {
              System.out.println("elemento [" + i + "][" + j + "]: ");
              matriz[i][j] = input.nextInt();
             suma += matriz[i][j];
          }  
        }
        System.out.println("la matriz es:");
        for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
      }
      input.close();

      double promedio = suma / totalnumeros;

      System.out.println("suma de los elementos de la matriz: " + suma);
      System.out.println("promedio de los elementos: " + promedio);
      System.out.println("cantidad de valores de la matriz: " + totalnumeros);
     }
}

