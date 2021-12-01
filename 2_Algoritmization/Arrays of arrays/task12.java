package array.of.arrays;

import java.util.Scanner;

/*
 12.Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class task12 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		int temp;
		
		System.out.print("Введите количество строк >> ");
		n = sc.nextInt();
		
		System.out.print("Введите количество столбцов >> ");
		n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		System.out.println("Дана матрица: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
		
        System.out.println("\nСтроки по возрастанию: ");
        for (int i = 0; i < n ; i++)
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (matrix[i][j] > matrix[i][k]) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][k];
                    matrix[i][k] = temp;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nСтроки по убыванию: ");
        for (int i = 0; i < n ; i++)
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (matrix[i][j] < matrix[i][k]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }		
	}

}
