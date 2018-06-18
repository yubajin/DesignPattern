package cn.yubajin.bridgeModel.pen_color;

public class Gray implements Color{

	public void bepaint(String penType, String name) {
		// TODO Auto-generated method stub
		//name参数由draw(name)传值，penType有相应pen实现类中给予
		System.out.println(penType + "灰色的" + name + ".");
	}

}
