package com.epam.module01.main;
//Найти произведение цифр заданного четырехзначного числа.
public class Main16 {

	 public static void main(String[] args) {
		 
		 int n = 6666;
		 int c = 1;
		 
		 while (n > 0) {
			 c = c * (n % 10);
			 n = n / 10;
			 
		 }
		 
		 System.out.println("Произведение цифр = " + c);
	 }
	 
}
