package one.dimensional.arrays;
//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.
public class task09 {
	
	public static void main(String[] args) {
		
		int[] a = new int[] {0, 1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		System.out.println(mostCommonNum(a));
	}	
		
	public static int mostCommonNum(int[] array) {
		
		int[] length = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[i] == array[j]) {
					length[i]++;
				}
			}
		}
	
	int res = array[0];
	int popularRes = array[0];
	
	for(int i = 0; i < array.length; i++) {
		if(length[i] > popularRes) {
			popularRes = length[i];
			res = array[i];
		}
		if(popularRes == length[i] && (array[i] < res)) {
			res = array[i];
		}
	}
	return res;
		

	}

}
