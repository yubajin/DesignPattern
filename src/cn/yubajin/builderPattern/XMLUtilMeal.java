package cn.yubajin.builderPattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilMeal {
	public static Object getBean(String args){
		try{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			
			Document doc = null;
			doc = builder.parse("configMeal.xml");
			
			NodeList nl = null;
			Node classNode = null;
			String cName = null;
			nl = doc.getElementsByTagName("className");
			
			if(args.equals("builderA")){
				classNode = nl.item(0).getFirstChild();
			}
			else if(args.equals("builderB")){
				classNode = nl.item(1).getFirstChild();
			}
			cName = classNode.getNodeValue();
			Class<?> c = Class.forName("cn.yubajin.builderPattern." + cName);
			Object obj = c.newInstance();
			
			return obj;
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
