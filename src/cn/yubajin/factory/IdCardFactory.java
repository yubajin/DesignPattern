package cn.yubajin.factory;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory{
	
	private List owners = new ArrayList();

	public List getOwners() {
		return owners;
	}

	protected Product createProduct(String productId) {
		// TODO Auto-generated method stub
		return new IdCard(productId);
	}

	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		owners.add(((IdCard)product).getProductId());
	}

}
