package cn.yubajin.builderPattern;

public class SubMealBuilderA extends MealBuilder{

	@Override
	public void buidFood() {
		meal.setFood("一碗牛肉面");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("一杯西瓜汁");
	}
	
}
