package array.of.arrays;

import java.util.Scanner;

/*
 9.Задана матрица неотрицательных чисел.
   Посчитать сумму элементов в каждом столбце.
   Определить, какой столбец содержит максимальную сумму.
 */

public class task09 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int k;
		int p;
		int column = 0;
		int sumColumn = 0;
		int maxSumColumn = 0;
		
		System.out.print("Введите количество строк >> ");
		k = sc.nextInt();
		
		System.out.print("Введите количество столбцов >> ");
		p = sc.nextInt();
		
		int[][] matrix = new int[k][p];
		
		System.out.println("Дана матрица: ");
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < p; j++) {
				matrix[i][j] = (int) (Math.random() * 30);
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
		
		for(int j = 0; j < p; j++) {
			for(int i = 0; i < k; i++) {
				sumColumn += matrix[i][j];
			}
			if(sumColumn > maxSumColumn) {
				maxSumColumn = sumColumn;
				column = j + 1;
			}
			sumColumn = 0;
		}
		
		System.out.println("\nНомер столбца с максимальной суммой:  " + column + "\nСумма элементов: " + maxSumColumn);		
		

	}

}
