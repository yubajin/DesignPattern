package cn.yubajin.CompositeModel;

import java.util.ArrayList;


public class Plate extends MyElement{
	private ArrayList<MyElement> list = new ArrayList<MyElement>();
	
	public void add(MyElement element){
		list.add(element);
	}
	
	public void remove(MyElement element){
		list.remove(element);
	}
	
	public void eat() {
		// TODO Auto-generated method stub
		for(Object object:list){
			((MyElement)object).eat();
		}
	}

}
