package cn.yubajin.chainofresponsibility;

public class SpecialSupport extends Support{//解决问题的具体类(仅解决特定编号的问题)
	private int number;
	
	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if(trouble.getNumber() == number){
			return true;
		}else{
			return false;
		}
	
	}

}
