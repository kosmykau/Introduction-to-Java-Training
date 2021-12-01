package array.of.arrays;

import java.util.Scanner;

/*
12.Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
*/

public class task13 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		int temp;
		boolean b;
		
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
		
		System.out.println("\nСтолцы по возрастанию: ");
        for (int j = 0; j < n; j++){
            do{
            b = true;
            for (int i = 0; i < n-1; i++){
                if (matrix[i][j] > matrix[i+1][j]){
                    b = false;
                    temp = matrix[i+1][j];
                    matrix[i+1][j] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
            }while(b == false);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nСтолбцы по убыванию: ");
        for (int j = 0; j < n; j++){
            do{
                b = true;
                for (int i = 0; i < n-1; i++){
                    if (matrix[i][j] < matrix[i+1][j]){
                        b = false;
                        temp = matrix[i+1][j];
                        matrix[i+1][j] = matrix[i][j];
                        matrix[i][j] = temp;
                    }
                }
            }while(b == false);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}