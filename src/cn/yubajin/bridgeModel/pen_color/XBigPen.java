package cn.yubajin.bridgeModel.pen_color;

public class XBigPen extends Pen{

	public void draw(String name) {
		// TODO Auto-generated method stub
		String penType = "超大号毛笔绘制";
		this.color.bepaint(penType, name);
	}

}
