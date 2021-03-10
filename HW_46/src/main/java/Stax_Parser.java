
//BEGIN

import java.io.*;
import java.net.URL;
import javax.xml.stream.*;

public class Stax_Parser {
	public static void main(String[] args) throws XMLStreamException, IOException {

		URL url = new URL("http://alex.academy/ebay.xml");

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

		InputStream in = url.openStream();

		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(in);
		int eventType = reader.getEventType();

		while (reader.hasNext()) {

			eventType = reader.next();

			if (eventType == XMLStreamReader.START_ELEMENT) {
				if (reader.getLocalName() == element_01) {
					System.out.println("Key Word: \t " + reader.getElementText());
				}
				if (reader.getLocalName() == element_02) {
					System.out.println("Engine: \t " + reader.getElementText());
				}
				if (reader.getLocalName() == element_03) {
					System.out.println("Version: \t " + reader.getElementText());
				}
				if (reader.getLocalName() == element_04) {
					System.out.println("Response time: \t " + reader.getElementText());
				}
				if (reader.getLocalName() == element_05) {
					System.out.println("Number of deals: " + reader.getAttributeValue(0));
				}
				if (reader.getLocalName() == element_06) {
					System.out.println("kadu-index-info: " + reader.getElementText());
					}
				if (reader.getLocalName() == element_07) {
					System.out.println("kadu-branch: " + reader.getElementText());
					}
				if (reader.getLocalName() == element_08) {
					System.out.println("database: " + reader.getElementText());
					}
				if (reader.getLocalName() == element_09) {
					System.out.println("form-id: " + reader.getElementText());
					}

				if (reader.getLocalName() == element_11) {
					System.out.println("review-count: " + reader.getElementText());
					}
				if (reader.getLocalName() == element_12) {
					System.out.println("is-paying: " + reader.getElementText());
					}
				if (reader.getLocalName() == element_13) {
					System.out.println("is-certified: " + reader.getElementText());
					}
				if (reader.getLocalName() == element_14) {
					System.out.println("homebase-id: " + reader.getElementText());
					}
				if (reader.getLocalName() == element_15) {
					System.out.println("has-info: " + reader.getElementText());
					}
				if (reader.getLocalName() == element_16) {
					System.out.println("phone: " + reader.getElementText());
					
					}
			}
		}
	}
}

//END