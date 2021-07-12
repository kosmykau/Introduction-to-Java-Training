package com.epam.module01.cycles;
//4. Составить программу нахождения произведения квадратов первых двухсот чисел.
import java.math.BigInteger;
public class task04 {

	public static void main(String[] args) {
		
		BigInteger a = BigInteger.valueOf(1);
		for(int i = 1; i <= 200; i++) {
		    a = a.multiply(BigInteger.valueOf((long) i * i));
		}
		
		System.out.println("Произведение квадратов от 1 до 200:\n " + a);

	}

}
