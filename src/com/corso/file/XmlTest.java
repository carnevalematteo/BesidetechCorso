package com.corso.file;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class XmlTest {

    public static void main(String[] args) {
        getElementNodewhitRoll("C:\\Users\\matte\\Desktop\\xml.txt","393");
    }


    public static void getElementNodewhitRoll(String file,String id){
     try{   File inputFile = new File("C:\\Users\\matte\\Desktop\\xml.txt");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        XPath xPath =  XPathFactory.newInstance().newXPath();

        String expression = "/class/student[@rollno="+id+"]";
        Node node = (Node) xPath.compile(expression).evaluate(
                doc, XPathConstants.NODE);



            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Student roll no :" + eElement.getAttribute("rollno"));
                System.out.println("First Name : "
                        + eElement
                        .getElementsByTagName("firstname")
                        .item(0)
                        .getTextContent());
                System.out.println("Last Name : "
                        + eElement
                        .getElementsByTagName("lastname")
                        .item(0)
                        .getTextContent());
                System.out.println("Nick Name : "
                        + eElement
                        .getElementsByTagName("nickname")
                        .item(0)
                        .getTextContent());
                System.out.println("Marks : "
                        + eElement
                        .getElementsByTagName("marks")
                        .item(0)
                        .getTextContent());

        }
    } catch (ParserConfigurationException e) {
        e.printStackTrace();
    } catch (SAXException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (XPathExpressionException e) {
        e.printStackTrace();
    }
}

}


