//import java.io.ByteArrayInputStream;
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//import java.nio.file.attribute.AclEntry.Builder;
//
//import javax.xml.XMLConstants;
//import javax.xml.transform.stream.StreamSource;
//import javax.xml.validation.SchemaFactory;
//
//import org.omg.CORBA.Request;
//import org.xml.sax.SAXException;
//
//import okhttp3.OkHttpClient;
//
//public class ScemaValidation {
//	public static void main(String[] args) {
//		String url = "http://alex.academy/ebay.xml";
//	}
//
//	public static boolean validateXMLSchema(File xsd_file, URL xml_url) throws SAXException, IOException {
//		OkHttpClient client = new OkHttpClient();
//		Builder b = new Request.Builder();
//		ByteArrayInputStream xml_str = new ByteArrayInputStream(
//				client.newCall(b.url(xml_url).get().build()).execute().body().string().getBytes());
//		SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(xsd_file).newValidator()
//				.validate(new StreamSource(xml_str));
//		return true;
//	}
//}
