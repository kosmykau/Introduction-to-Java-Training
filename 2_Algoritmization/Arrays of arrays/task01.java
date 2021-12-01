package array.of.arrays;
//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class task01 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[4][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("Дана матрица:");
        printMatrix(matrix);

        System.out.println("\nВывести на экран все нечетные столбцы, у которых первый элемент больше последнего.");
        printOddColumns(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d", arrays[i][j]);
            }
            System.out.println();
        }
    }

    public static void printOddColumns(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j += 2) {
                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.printf("%3d", array[i][j]);
                }
            }
            System.out.println();
        }

 }
}
