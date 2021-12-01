package one.dimensional.arrays;
//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
public class task03 {

	public static void main(String[] args) {
		
		int[] a = new int[] {1, 2, 4, 5, -1, 0, -33, -11};
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				pos++;
			}
			if(a[i] < 0) {
				neg++;
			}
			if(a[i] == 0) {
				zero++;
			}
		}
		System.out.println("Количество отрицательных элементов = " + neg);
		System.out.println("Количество положительных элементов = " + pos);
		System.out.println("Количество нулевых элементов = " + zero);


	}

}
