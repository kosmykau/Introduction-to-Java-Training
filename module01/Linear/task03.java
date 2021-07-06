package com.epam.module01.main;
//3. Вычислить значение выражения по формуле (все переменные принимают 
//действительные значения): 𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 ∗ 𝑡𝑔 𝑥𝑦 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
public class task03 {
	
	public static void main(String[] args) {
		
	double x = 10; 
        double y = 20;

        double xRad = x * Math.PI / 180.0;
        double yRad = y * Math.PI / 180.0;

        double result = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad);

        System.out.println(result);
    }
	}
