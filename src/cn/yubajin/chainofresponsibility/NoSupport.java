package cn.yubajin.chainofresponsibility;

public class NoSupport extends Support{//解决问题的具体类(永远"不处理问题")

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}

}
