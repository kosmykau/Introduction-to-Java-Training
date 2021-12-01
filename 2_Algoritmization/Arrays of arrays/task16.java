package array.of.arrays;

/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
 равны между собой. Построить такой квадрат.
 Пример магического квадрата порядка 3:
 			6	1	8
 			7	5	3
 			2	9	4
 */

public class task16 {

	public static void main(String[] args) {
		
		int n = 3;
        int[][] magicSquare = new int[n][n];

        int num = 1;
        int row = 0;
        int column = n / 2;
        int currentRow;
        int currentColumn;
        while (num <= n * n) {
            magicSquare[row][column] = num;
            num++;
            currentRow = row;
            currentColumn = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = currentRow + 1;
                column = currentColumn;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.printf("%3d ", magicSquare[i][j]);
            }
            System.out.println();
        }

	}

}
