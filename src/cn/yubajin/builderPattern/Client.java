package cn.yubajin.builderPattern;

public class Client {

	public static void main(String[] args) {
		
		MealBuilder a = (MealBuilder)XMLUtilMeal.getBean("builderA");
		
		KFCWaiter kfcWater = new KFCWaiter();
		kfcWater.setMealBuilder(a);
		Meal meal = kfcWater.construct();
		
		System.out.println("套餐组成");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}

}
