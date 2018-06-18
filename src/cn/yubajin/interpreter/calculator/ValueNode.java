package cn.yubajin.interpreter.calculator;

/**
 * 终结符表达式类
 * @author Administrator
 *
 */
public class ValueNode implements Node{
	private int value;
	
	public ValueNode(int value){
		this.value = value;
	}

	public int interpret() {
		return this.value;
	}

}
