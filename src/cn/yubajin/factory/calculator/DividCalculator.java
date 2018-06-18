package cn.yubajin.factory.calculator;

public class DividCalculator implements Calculator {

	public int calculate(int num1, int num2) {
		
		if (0 == num2) {
			throw new RuntimeException("被除数为0");
		}
		
		return num1 / num2;
		
	}

}
