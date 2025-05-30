public class MaximoMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {3, 5, 9},
            {7, 2, 8},
            {6, 4, 1}
        };

        int max = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }

        System.out.println("El valor máximo en la matriz es: " + max);
    }
}
