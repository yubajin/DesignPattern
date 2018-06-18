package cn.yubajin.command;

import java.awt.Point;

public class DrawCommand implements Command{

	//绘制对象
	protected Drawable drawable;
	
	//绘制位置
	private Point position;
	
	public DrawCommand(Drawable drawable, Point position){
		this.drawable = drawable;
		this.position = position;
	}
	
	public void execute() {
		drawable.draw(position.x, position.y);
	}

}
