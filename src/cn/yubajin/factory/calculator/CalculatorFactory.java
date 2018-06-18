package cn.yubajin.factory.calculator;

public class CalculatorFactory {

	public static Calculator getCaculator(String operator) {
		
		operator = operator.trim();
		
		if ("+".equals(operator)) {
			return new PlusCalculator();
		} else if ("-".equals(operator)) {
			return new SubCalculator();
		} else if ("*".equals(operator)) {
			return new MultiCalculator();
		} else if ("/".equals(operator)) {
			return new DividCalculator();
		}
		return null;
	}
	
}
