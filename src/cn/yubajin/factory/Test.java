package cn.yubajin.factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory idCardFactory = new IdCardFactory();
		
		Product product1 = idCardFactory.create("产品1号");
		product1.use();
		
		Product product2 = idCardFactory.create("产品2号");
		product2.use();	
		
		
	}

}
