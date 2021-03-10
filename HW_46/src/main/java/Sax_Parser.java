//BEGIN


import java.io.IOException;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class Sax_Parser extends DefaultHandler {

	public static void main(String[] args) throws IOException, SAXException,
			ParserConfigurationException {
		String url = "http://alex.academy/ebay.xml";

		final String element_01 = "orig-kw";
		final String element_02 = "engine";
		final String element_03 = "kadu-version";
		final String element_04 = "response-time";
		final String element_05 = "deals";
		
		final String element_06 = "kadu-index-info";
		final String element_07 = "kadu-branch";
		final String element_08 = "database";
		
		final String element_09 = "form-id";
		final String element_10 = "name";
		
		final String element_11 = "review-count";
		final String element_12 = "is-paying";
		final String element_13 = "is-certified";
		final String element_14 = "homebase-id";
		final String element_15 = "has-info";
		final String element_16 = "phone";
		
		final String attribute_01 = "count";
		final String attribute_02 = "total";

		// Create a "parser factory" for creating SAX parsers
		SAXParserFactory f = SAXParserFactory.newInstance();

		// Now use the parser factory to create a SAXParser object
		SAXParser p = f.newSAXParser();

		// Create an instance of this class; it defines all the handler methods
		DefaultHandler h = new DefaultHandler() {

			boolean handler_01 = false;
			boolean handler_02 = false;
			boolean handler_03 = false;
			boolean handler_04 = false;
			boolean handler_05 = false;
			
			boolean handler_06 = false;
			boolean handler_07 = false;
			boolean handler_08 = false;
			boolean handler_09 = false;
			boolean handler_10 = false;
			boolean handler_11 = false;
			boolean handler_12 = false;
			boolean handler_13 = false;
			boolean handler_14 = false;
			boolean handler_15 = false;
			boolean handler_16 = false;
			
			String attribute_count = null;

			// a - uri; b - localName; c - qName; d - attributes
			public void startElement(String a, String b, String c, Attributes d)
					throws SAXException {

				if (c.equalsIgnoreCase(element_01)) {
					handler_01 = true;
				}
				if (c.equalsIgnoreCase(element_02)) {
					handler_02 = true;
				}
				if (c.equalsIgnoreCase(element_03)) {
					handler_03 = true;
				}
				if (c.equalsIgnoreCase(element_04)) {
					handler_04 = true;
				}
				if (c.equalsIgnoreCase(element_06)) {
					handler_06 = true;
				}
				if (c.equalsIgnoreCase(element_07)) {
					handler_07 = true;
				}
				if (c.equalsIgnoreCase(element_08)) {
					handler_08 = true;
				}
				if (c.equalsIgnoreCase(element_09)) {
					handler_09 = true;
				}
				if (c.equalsIgnoreCase(element_10)) {
					handler_10 = true;
				}
				if (c.equalsIgnoreCase(element_11)) {
					handler_11 = true;
				}
				if (c.equalsIgnoreCase(element_12)) {
					handler_12 = true;
				}
				if (c.equalsIgnoreCase(element_13)) {
					handler_13 = true;
				}
				if (c.equalsIgnoreCase(element_14)) {
					handler_14 = true;
				}
				if (c.equalsIgnoreCase(element_15)) {
					handler_15 = true;
				}
				if (c.equalsIgnoreCase(element_16)) {
					handler_16 = true;
				}

				if (c.equalsIgnoreCase(element_05)) {
					handler_05 = true;
					attribute_count = d.getValue(attribute_01);
				}
			}

			public void endElement(String a, String b, String c)
					throws SAXException {
			}

			public void characters(char ch[], int start, int length)
					throws SAXException {
				
				if (handler_01) {
					System.out.println("Key Word: \t " + new String(ch, start, length));
					handler_01 = false;
				}
				if (handler_02) {
					System.out.println("Engine: \t " + new String(ch, start, length));
					handler_02 = false;
				}
				if (handler_03) {
					System.out.println("Version: \t " + new String(ch, start, length));
					handler_03 = false;
				}
				if (handler_04) {
					System.out.println("Response time:\t " + new String(ch, start, length));
					handler_04 = false;
				}
				if (handler_06) {
					System.out.println("kadu-index-info:\t " + new String(ch, start, length));
					handler_06 = false;
				}
				if (handler_07) {
					System.out.println("kadu-branch:\t " + new String(ch, start, length));
					handler_07 = false;
				}
				if (handler_08) {
					System.out.println("Database:\t " + new String(ch, start, length));
					handler_08 = false;
				}
				if (handler_09) {
					System.out.println("form-id:\t " + new String(ch, start, length));
					handler_09 = false;
				}
				if (handler_11) {
					System.out.println("review-count:\t " + new String(ch, start, length));
					handler_11 = false;
				}
				if (handler_12) {
					System.out.println("Is-paying:\t " + new String(ch, start, length));
					handler_12 = false;
				}
				if (handler_13) {
					System.out.println("is-certified:\t " + new String(ch, start, length));
					handler_13 = false;
				}
				if (handler_14) {
					System.out.println("homebase-id:\t " + new String(ch, start, length));
					handler_14 = false;
				}
				if (handler_15) {
					System.out.println("has-info:\t " + new String(ch, start, length));
					handler_15 = false;
				}
				if (handler_16) {
					System.out.println("Phone:\t " + new String(ch, start, length));
					handler_16 = false;
				}

				if (handler_05) {
					System.out.println("Number of deals: " + attribute_count);
					handler_05 = false;
				}
				
			}
		};
		p.parse(url, h);
	}
}
