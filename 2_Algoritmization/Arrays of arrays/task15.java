package array.of.arrays;

import java.util.Scanner;

/*
15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class task15 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		int max = 0;
		
        System.out.println("Введите количествово строк >> ");
        n = sc.nextInt();
        System.out.println("Введите количество столбцов >> ");
        n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Сгенерированная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println("\nМаксимальный элемент матрицы: " + max);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] % 2 == 1)
                    matrix[i][j] = max;
            }
        }

        System.out.println("\nИзмененная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d ",matrix[i][j]);
            }
            System.out.println();
        }
		
	}

}
