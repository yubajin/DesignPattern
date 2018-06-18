package cn.yubajin.chainofresponsibility;

public class OddSupport extends Support{//解决问题的具体类(仅解决奇数编号的问题)

	public OddSupport(String name) {//构造函数
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {//解决问题的方法
		if (trouble.getNumber() % 2 == 1){
			return true;
		}else {
			return false;
		}
	}

}
