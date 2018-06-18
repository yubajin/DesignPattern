package cn.yubajin.chainofresponsibility;

public abstract class Support {//解决问题的抽象类
	private String name;
	private Support next;//相当于c语言中的指针
	
	public Support(String name) {
		this.name = name;
	}
	
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	
	public final void support(Trouble trouble){//解决问题的步骤
		if(resolve(trouble)){
			done(trouble);
		} else if(next!=null){//推卸的对象
			next.support(trouble);
		}else{
			fail(trouble);
		}
	}

	protected abstract boolean resolve(Trouble trouble);
	
	public String toString(){
		return "[" + name + "]";
	}
	
	
	protected void done(Trouble trouble){
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	
	protected void fail(Trouble trouble){
		System.out.println(trouble + " cannot be resolved.");
	}
}
