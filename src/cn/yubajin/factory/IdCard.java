package cn.yubajin.factory;

public class IdCard extends Product{
	
	private String productId;
	
	IdCard(String productionId){
		this.productId = productionId;
		System.out.println("Create product " + productId);
	}

	public void use() {
		// TODO Auto-generated method stub
		System.out.println("production " + productId + "is using");
	}
	
	public String getProductId(){
		return productId;
	}

}
