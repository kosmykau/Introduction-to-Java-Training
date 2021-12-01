package array.of.arrays;

import java.util.Random;

/*
 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
 */

public class task14 {

	public static void main(String[] args) {
		
		Random rd = new Random();
        int a = rd.nextInt(5)+3;
        int b = rd.nextInt(5)+3;
        int[][] matrix = new int[a][b];

        System.out.println("Случайная матрица: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (j >= i)
                    matrix[i][j] = 1;
            }
        }

        for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
        }

    }
}