package cn.yubajin.bridgeModel.pen_color;

public class BigPen extends Pen{

	public void draw(String name) {
		// TODO Auto-generated method stub
		String penType = "大号毛笔绘制";
		this.color.bepaint(penType, name);
	}
	
}
