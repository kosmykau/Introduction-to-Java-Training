package com.jonline.module01.main;
//ычислить значение выражения по формуле (все переменные принимают действительные значения):
//𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 ∗ 𝑡𝑔 𝑥𝑦 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
public class Third {

	public static void main(String[] args) {
		double x;
		double y;
		double temp;
		
		x = 10;
		y = 20;
		
		temp = (Math.asin(x) + Math.acos(y));
		
		System.out.print(temp);
		

	}

}

