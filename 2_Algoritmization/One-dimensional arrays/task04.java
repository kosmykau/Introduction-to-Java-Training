package one.dimensional.arrays;
//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class task04 {

	public static void main(String[] args) {
		
		int[] a = new int[] {1, 2, 3, 4, 5, 11, 22, 33, 44, 55};
		int max = 0;
		int iMax = 0;
		int min = 0;
		int iMin = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				iMax = i;
			}
			if(a[i] < min) {
				min = a[i];
				iMin = i;
			}
		}
		System.out.println("Максимальный элемент = " + max);
		System.out.println("Минимальный элемент = " + min);
		
		a[iMax] = min;
		a[iMin] = max;
		
		System.out.println("Максимальный элемент = " + a[iMax]);
		System.out.println("Минимальный элемент = " + a[iMin]);
		
	

	}

}
