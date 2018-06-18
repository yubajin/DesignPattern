package cn.yubajin.chainofresponsibility;

public class Trouble {//描述一个问题的类
	private int number;

	public Trouble(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "[Trouble " + number + "]";
	}
	
}
