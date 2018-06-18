package cn.yubajin.bridgeModel.pen_color;

public class SmallPen extends Pen{
	public void draw(String name) {
		// TODO Auto-generated method stub
		String penType = "小号毛笔绘制";
		this.color.bepaint(penType, name);
	}
}
