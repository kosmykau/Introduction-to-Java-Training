package one.dimensional.arrays;
//8. Дана последовательность целых чисел a1,a2,..,an. Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,..,an).
public class task08 {

	public static void main(String[] args) {
		
		int[] num = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int min = 0;
		System.out.println("Исходная последовательность: " );
		
		for(int A : num) {
			System.out.print(A + ", ");
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] < min)
				min = num[i];
		}
		int[] newNum = new int[num.length - 1];
		
		System.out.println("\nНовая последовательность: ");
		
		for(int i = 0; i < newNum.length; i++) {
			if(num[i] == min)
				continue;
			else newNum[i] = num[i];
			System.out.print(newNum[i] + ", ");
		}
		
	}

}
