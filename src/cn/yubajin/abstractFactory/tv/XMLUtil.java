package cn.yubajin.abstractFactory.tv;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	
	public static Object getBean(){
		try{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse("configTV-abs.xml");
			
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			
			System.out.println(nl.item(0).getFirstChild());
			System.out.println(nl.item(1).getFirstChild());
			System.out.println(nl.item(2).getFirstChild());
			
			String className = classNode.getNodeValue().trim();
			
			String packageName = "cn.yubajin.abstractFactory.tv";
			
			className = packageName + "." + className;
			
			Class clazz = Class.forName(className);
			Object obj = clazz.newInstance();
			return obj;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
