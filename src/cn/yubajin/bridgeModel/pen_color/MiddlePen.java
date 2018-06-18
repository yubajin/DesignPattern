package cn.yubajin.bridgeModel.pen_color;

public class MiddlePen extends Pen{
	public void draw(String name) {
		// TODO Auto-generated method stub
		String penType = "中号毛笔绘制";
		this.color.bepaint(penType, name);
	}
}
