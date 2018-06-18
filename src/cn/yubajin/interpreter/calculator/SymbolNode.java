package cn.yubajin.interpreter.calculator;

/**
 * 抽象非终结符表达式类
 * @author Administrator
 *
 */
public abstract class SymbolNode implements Node{
	protected Node left;
	protected Node right;
	
	public SymbolNode(Node left, Node right){
		this.left = left;
		this.right = right;
	}

}
