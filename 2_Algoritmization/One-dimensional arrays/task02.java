package one.dimensional.arrays;
//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
public class task02 {

	public static void main(String[] args) {
		
		int[] a = new int[] {1, 2, 3, 4, 5, 11, 22, 33, 44, 55};
		int z = 4;
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > z) {
				a[i] = z;
				count++;
			}
	    }
		
		for(int i = 0; i < a.length; i++);
		
		System.out.println("Количество замен = " + count);



 }
}