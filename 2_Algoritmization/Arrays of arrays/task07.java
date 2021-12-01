package array.of.arrays;

import java.util.Scanner;

/*
  7.Сформировать квадратную матрицу порядка N по правилу: 
    A[I,J] = sin((I^2 - J^2) / N)
   и подсчитать количество положительных элементов в ней.
 */

public class task07 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		int positiveElement;
		
		System.out.println("Введите четную размерность матрицы n >> ");
		n = sc.nextInt();
		while(n % 2 != 0) {
			System.out.println("Неверный ввод!");
			System.out.println("Введите четную размерность матрицы n >> ");
			n = sc.nextInt();
		}
		
		double[][] matrix = new double[n][n];
		
		System.out.println("Дана матрица: ");
		positiveElement = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = Math.sin((Math.pow(i + 1, 2) - Math.pow(j + 1, 2)) / n);
				if(matrix[i][j] > 0) {
					positiveElement++;
				}
				System.out.printf("%15f", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.printf("\nКоличество положительных желементов = %d", positiveElement);
		
	}

}
