package cn.yubajin.bridgeModel.videoplay_crossplatform;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilFile {
	public static Object getBean(String args){
		try{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			
			Document doc = null;
			doc = builder.parse("configFile.xml");
			
			NodeList nl = null;
			Node classNode = null;
			String cName = null;
			nl = doc.getElementsByTagName("className");
			
			if(args.equals("version")){
				classNode = nl.item(0).getFirstChild();
			}
			else if(args.equals("file")){
				classNode = nl.item(1).getFirstChild();
			}
			cName = classNode.getNodeValue();
			Class<?> c = Class.forName("cn.yubajin.bridgeModel.videoplay_crossplatform." + cName);
			Object obj = c.newInstance();
			
			return obj;
			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
