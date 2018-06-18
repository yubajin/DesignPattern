package cn.yubajin.builderPattern;

public abstract class MealBuilder {
	
	protected Meal meal = new Meal();
	
	public abstract void buidFood();
	
	public abstract void buildDrink();

	public Meal getMeal(){
		return this.meal;
	}
	
}
