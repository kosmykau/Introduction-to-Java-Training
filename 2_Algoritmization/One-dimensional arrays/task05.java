package one.dimensional.arrays;
//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class task05 {

	public static void main(String[] args) {
		
		int[] a = new int[] {1, 2, 3, 4, 5, 11, 22, 33, 44, 55};
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > i);
				System.out.println(a[i]);
		}
		
		

	 }
  }

