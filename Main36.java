package com.epam.module01.main;
//Найти частное произведение четных и нечетных цифр четырехзначного числа.
public class Main36 {
	
	public static void main(String[] args) {
	
	 int number = 1234;
	 System.out.println("Число: " + number);
	 
	 double quotient = 0.0;
	
	 int composition1 = 1;
	 int composition2 = 1;
	
	 int newNumber = number;
	
	 int count = 0;
	 
	 while (newNumber != 0) {
		 composition1 = composition1 * (newNumber % 10);
		 newNumber = (int) newNumber / 100;
		 count ++;
		 System.out.println(count + " " + newNumber + " " + composition1);
	 }
	 
	 newNumber = number / 10;
	 while (newNumber != 0) {
		 composition2 = composition2 * (newNumber % 10);
		 newNumber = (int)	newNumber / 100;
		 count ++;
		 System.out.println(count + " " + newNumber + " " + composition2);
	 }
	 
	 if (count % 2 != 0) {
		 System.out.println("Произведение нечетных цифр: " + composition1);
		 System.out.println("Произведение четных цифр = " + composition2);
		 quotient = (double) composition2 / composition1;
		 System.out.println(composition2 + " / " + composition1 + " = " + quotient);
	 }
	 else {
		 System.out.println("Произведение нечетных цифр = " + composition2);
		 System.out.println("Произведение четных цифр = " + composition1);
		 quotient = (double) composition1 / composition2;
		 System.out.println(composition1 + " / " + composition2 + " = " + quotient);
	 }
}
}
	 


	
