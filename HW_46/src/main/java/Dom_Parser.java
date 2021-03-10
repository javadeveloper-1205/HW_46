//BEGIN

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Dom_Parser {

	public static void main(String[] args) throws Throwable, Exception,
			ParserConfigurationException {

		String url = "http://alex.academy/ebay.xml";

		String node = "kadu-response";
		String node2 = "categories";
		String node3 = "merchants";

		String element_01 = "orig-kw";
		String element_02 = "engine";
		String element_03 = "kadu-version";
		String element_04 = "response-time";
		String element_05 = "deals";
		String element_06 = "kadu-index-info";
		String element_07 = "kadu-branch";
		String element_08 = "database";
		
		String element_09 = "form-id";
		String element_10 = "name";
		
		String element_11 = "review-count";
		String element_12 = "is-paying";
		String element_13 = "is-certified";
		String element_14 = "homebase-id";
		String element_15 = "has-info";
		String element_16 = "phone";
		
		String attribute_01 = "count";
		String attribute_02 = "total";

		// Get the DOM Builder Factory
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();

		// Get the DOM Builder
		DocumentBuilder b = f.newDocumentBuilder();

		// Load and Parse the XML document contains the complete XML as a Tree.
		Document doc = b.parse(url);

		// Optional
		doc.getDocumentElement().normalize();

		// Parsing elements
		System.out.println("Key Word: \t "
		+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_01).item(0)
		.getChildNodes().item(0).getNodeValue());
		System.out.println("Engine: \t "
		+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_02).item(0)
		.getChildNodes().item(0).getNodeValue());
		System.out.println("Version: \t "
		+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_03).item(0)
		.getChildNodes().item(0).getNodeValue());
		System.out.println("Response time: \t "
		+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_04).item(0)
		.getChildNodes().item(0).getNodeValue());
		
		System.out.println("kadu-index-info: "
				+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_06).item(0)
				.getChildNodes().item(0).getNodeValue());
		
		System.out.println("kadu-branch: "
				+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_07).item(0)
				.getChildNodes().item(0).getNodeValue());
		
		System.out.println("database: "
				+ ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_08).item(0)
				.getChildNodes().item(0).getNodeValue());
		System.out.println("Form-id: "
				+ ((Element) doc.getElementsByTagName(node2).item(0)).getElementsByTagName(element_09).item(0)
				.getChildNodes().item(0).getNodeValue());
		System.out.println("Form-id: "
				+ ((Element) doc.getElementsByTagName(node2).item(0)).getElementsByTagName(element_10).item(0)
				.getChildNodes().item(0).getNodeValue());
	
		System.out.println("Review-count: "
				+ ((Element) doc.getElementsByTagName(node3).item(0)).getElementsByTagName(element_11).item(0)
				.getChildNodes().item(0).getNodeValue());
		System.out.println("is-paying: "
				+ ((Element) doc.getElementsByTagName(node3).item(0)).getElementsByTagName(element_12).item(0)
				.getChildNodes().item(0).getNodeValue());
		System.out.println("is-certified: "
				+ ((Element) doc.getElementsByTagName(node3).item(0)).getElementsByTagName(element_13).item(0)
				.getChildNodes().item(0).getNodeValue());
		System.out.println("homebase-id: "
				+ ((Element) doc.getElementsByTagName(node3).item(0)).getElementsByTagName(element_14).item(0)
				.getChildNodes().item(0).getNodeValue());
		System.out.println("has-info: "
				+ ((Element) doc.getElementsByTagName(node3).item(0)).getElementsByTagName(element_15).item(0)
				.getChildNodes().item(0).getNodeValue());
		 System.out.println("phone: " 
				 + ((Element) doc.getElementsByTagName(node3).item(0)).getElementsByTagName(element_16).item(0)
				.getChildNodes().item(0).getNodeValue());
		String actualResult = "phone1";
		
		
//		System.out.print(actualResult.equals(expectedResult));

			
		// Parsing attribute
		System.out.println("Number of deals: "
		+ ((Element) doc.getElementsByTagName(element_05).item(0)).getAttribute(attribute_01).trim());
		
		System.out.println("Display Items Total "
				+ ((Element) doc.getElementsByTagName("display-items").item(0)).getAttribute("end-item").trim());
		
		System.out.println("Display Items Total "
				+ ((Element) doc.getElementsByTagName("display-items").item(0)).getAttribute(attribute_02).trim());
	}
}