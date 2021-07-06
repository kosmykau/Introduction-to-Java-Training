package com.epam.module01.branching;
//4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class task04 {

    public static void main(String[] args) {
		
	int A = 5;
	int B = 6;
		
	int x = 1;
	int y = 3;
	int z = 7;
		
	if (x <= A && y <= B || y <= A && x <= B || x <= A && z <= B || z <= A && x <= B || z <= A && y <= B || y <= A && z <= B) 
            System.out.println("Кирпич пройдет через отвертие.");    
	else 
            System.out.println("Кирпич не поройдет через отверстие.");
			
	}
}
