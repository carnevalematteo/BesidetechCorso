package com.gaetano.xpathese;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XPathReadElement {

    public static void main(String[] args) {

        try {
            File inputFile = new File("test.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            XPath xPath =  XPathFactory.newInstance().newXPath();

            String expression = "/class/studente[@id = '1']";
            NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(
                    doc, XPathConstants.NODESET);

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nNode = nodeList.item(i);
                System.out.println("\nElemento:" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student id : "
                            + eElement.getAttribute("id"));
                    System.out.println("Nome : "
                            + eElement
                            .getElementsByTagName("Nome")
                            .item(0)
                            .getTextContent());
                    System.out.println("Cognome : "
                            + eElement
                            .getElementsByTagName("Cognome")
                            .item(0)
                            .getTextContent());
                    System.out.println("email : "
                            + eElement
                            .getElementsByTagName("email")
                            .item(0)
                            .getTextContent());
                    System.out.println("Eta' : "
                            + eElement
                            .getElementsByTagName("eta")
                            .item(0)
                            .getTextContent());
                }
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