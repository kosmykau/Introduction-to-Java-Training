package one.dimensional.arrays;
//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class task10 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {0, 1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = 0;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
