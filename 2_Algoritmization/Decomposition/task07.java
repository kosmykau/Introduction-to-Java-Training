package Decomposition;

/*
 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class task07 {

	public static void main(String[] args) {
		System.out.println("Сумма факториалов нечетных чисел от 1 до 9: " + sumOfTheOddNumbersFactorials());

	}
	
	public static int sumOfTheOddNumbersFactorials() {
		int sum = 0;
		for(int i = 1; i < 10; i++) {
			if(i % 2 != 0) {
				sum += factorial(i);
			}
		}
		return sum;
	}
	
	public static int factorial(int f) {
		int res = 1;
		for(int i = 1; i <= f; i++) {
			res *= i;
		}
		return res;
	}

}
