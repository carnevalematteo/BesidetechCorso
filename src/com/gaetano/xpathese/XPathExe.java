package com.gaetano.xpathese;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;

import java.io.*;
import java.util.regex.Pattern;


public class XPathExe {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        File inputFile = new File("test.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        XPath xPath =  XPathFactory.newInstance().newXPath();
        String espressione = "/class/studente";
        NodeList nodeList = (NodeList) xPath.compile(espressione).evaluate(doc, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nNode = nodeList.item(i);
            System.out.println("\nStudente :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.println("id :" + eElement.getAttribute("id"));
                System.out.println("Nome : "
                        + eElement
                        .getElementsByTagName("Nome")
                        .item(0)
                        .getTextContent());
                System.out.println("Cognome: "
                        + eElement
                        .getElementsByTagName("Cognome")
                        .item(0)
                        .getTextContent());
                System.out.println("email : "
                        + eElement
                        .getElementsByTagName("email")
                        .item(0)
                        .getTextContent());
                System.out.println("eta' : "
                        + eElement
                        .getElementsByTagName("eta")
                        .item(0)
                        .getTextContent());
            }
        }

}



}