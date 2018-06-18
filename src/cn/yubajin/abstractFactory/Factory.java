package cn.yubajin.abstractFactory;

public abstract class Factory {
	public static Factory getFactory(String classname){
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(classname).newInstance();
		} catch (Exception e) {
			System.out.println("没有找到 " +classname + " 类 ");
		}
		
		return factory;
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
