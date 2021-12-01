package one.dimensional.arrays;
//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
public class task06 {

	public static void main(String[] args){
       
		double[] a = new double[] {4.4, 2.6, 3.1, 5.9, 7.8};
		double sum = 0;
		
		System.out.println("Последовательность вещественных чисел: " );
		
		for(double A : a) {
			System.out.print(A + ", ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			 if(isPrime(i)) {
				 sum += a[i];
			 }
		}
		System.out.println("Сумма чисел, порядковые номера которых являются простыми числами = " + sum);

	}
	
		public static boolean isPrime(int x) {
			
			int temp;
			
			if(x < 2)
				return false;
			
			for(int i = 2; i <= x / 2; i++) {
				temp = x % i;
				if (temp == 0) {
					return false;
				}
			}
			return true;
			
	}

}
