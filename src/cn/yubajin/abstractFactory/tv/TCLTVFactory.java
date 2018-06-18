package cn.yubajin.abstractFactory.tv;

public class TCLTVFactory implements TVFactory{

	public TV produceTV() {
		// TODO Auto-generated method stub
		System.out.println("TCL电视机工厂生产TCL电视机");
		return new TCLTV();
	}

}
