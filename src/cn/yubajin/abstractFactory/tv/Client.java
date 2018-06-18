package cn.yubajin.abstractFactory.tv;

public class Client {
	public static void main(String[] args) {
		try {
			TV tv;
			TVFactory tvFactory;
			tvFactory = (TVFactory)XMLUtil.getBean();
			
			tv = tvFactory.produceTV();
			tv.play();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
