package cn.yubajin.factory.tv;


public class TVFactory extends Factory{
	public static TV produceTV(String brand) throws Exception{
		
		brand = "tv." + brand + "TV";
		
		System.out.println("brand:"+brand);
		
		Class clazz=Class.forName(brand);
		TV obj=(TV)clazz.newInstance();
		System.out.println("这个对象是:"+obj.getClass());
	    return obj;
//
//		
//		if (brand.equalsIgnoreCase("Haier")){
//			System.out.println("电视机工厂生产海尔电视机");
//			return new HaierTV();
//		}
//		else if (brand.equalsIgnoreCase("Hisense")){
//			System.out.println("电视机工厂生产海信电视机");
//			return new HisenseTV();
//		}else{
//			throw new Exception("对不起，不能生产该品牌电视机!");
//		}
	}

	@Override
	public Object produce() {
		// TODO Auto-generated method stub
		return null;
	}
}
