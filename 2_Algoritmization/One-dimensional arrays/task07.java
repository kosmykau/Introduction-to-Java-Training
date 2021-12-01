package one.dimensional.arrays;
//7. Даны действительные числа a1,a2,...,an . Найти max(a1 +a2n,a2 +a2n−1,...,an +an+1).
public class task07 {

	public static void main(String[] args) {
		
		int[] a = new int[]{2, 3, 4, 5, 6};
		int max = a[0];
		
		for(int i = 0; i < a.length - 1; i++) {
			if(max > (a[i] + a[i + 1])) {
				max = a[i] + a[i + 1];
			}
		}
		System.out.println("Max = " + max);
		
	}

}
