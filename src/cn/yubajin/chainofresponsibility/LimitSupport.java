package cn.yubajin.chainofresponsibility;

public class LimitSupport extends Support{//解决问题的具体类(仅解决编号小于指定编号的问题)
	private int limit;

	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if(trouble.getNumber() < limit){
			return true;
		}else{
			return false;
		}
	}

}
