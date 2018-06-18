package cn.yubajin.factory.calculator;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int num1, num2;
		
		String op;

		System.out.println("输入运算式如 a + b：");
		
		num1 = scann.nextInt();
		
		op = scann.next();
		
		num2 = scann.nextInt();
		
		Calculator cal = CalculatorFactory.getCaculator(op);
		
		System.out.println("运算结果为:" + cal.calculate(num1, num2));
		
		scann.close();
		
	}

}
