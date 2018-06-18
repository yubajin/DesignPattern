package cn.yubajin.builderPattern;

public class KFCWaiter {
	private MealBuilder mb;
	
	public void setMealBuilder(MealBuilder mb){
		this.mb = mb;
	}
	
	public Meal construct(){
		mb.buidFood();
		mb.buildDrink();
		return mb.getMeal();
	}
}
