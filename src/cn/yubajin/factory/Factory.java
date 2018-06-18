package cn.yubajin.factory;

public abstract class Factory {
	
	public final Product create(String productId){
		
		Product product = createProduct(productId);
		registerProduct(product);
		
		return product;
	}
	
	protected abstract Product createProduct(String productId);
	protected abstract void registerProduct(Product product);
}
