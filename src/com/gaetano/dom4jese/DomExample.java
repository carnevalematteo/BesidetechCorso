package com.gaetano.dom4jese;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DomExample {
    public static void main(String[] args) {

     //   readProp();
        modifyElem();
    }
    public static void readProp(){
        try {
            File inputFile = new File("C:\\Users\\gaeta\\Corso\\BesidetechCorso\\test.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputFile);
            System.out.println(" Classe Studente :" + document.getRootElement().getName());  //root --> class

           Element classElement = document.getRootElement();
           classElement.element("");


            List<Node> nodes = document.selectNodes("/class/studente");   // prende tutto crea la lista.. dei nodi tag
            //  in questo caso --> studente ---- class/studente/[@id='1'] per esempio come singolo studente


            for (Node node : nodes) {
                System.out.println("\nStudente :"
                        + node.getName());
                System.out.println("id : "
                        + node.valueOf("@id") );
                System.out.println("Nome : "
                        + node.selectSingleNode("Nome").getText());
                System.out.println("Cognome : "
                        + node.selectSingleNode("Cognome").getText());
                System.out.println("email : "
                        + node.selectSingleNode("email").getText());
                System.out.println("eta : "
                        + node.selectSingleNode("eta").getText());
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
    public static void modifyElem(){
    try {
        File inputFile = new File("C:\\Users\\gaeta\\Corso\\BesidetechCorso\\test.xml");
        SAXReader reader = new SAXReader();
        Document document = reader.read( inputFile );


        Element classElement = document.getRootElement();

        List<Node> nodes = document.selectNodes("/class/studente[@id = '1']" );

        for (Node node : nodes) {
            Element element = (Element) node;
            Iterator<Element> iterator = element.elementIterator("eta");

            while(iterator.hasNext()) {
                Element etaMod = (Element)iterator.next();  //prende il primo elemento
                etaMod.setText("38");
            }
        }

        OutputFormat format = OutputFormat.createPrettyPrint();
        FileWriter writer= new FileWriter("C:\\Users\\gaeta\\Corso\\BesidetechCorso\\test.xml");
        XMLWriter writer2 = new XMLWriter( writer, format );
        writer2.write( document );
        writer2.close();


    } catch (DocumentException e) {
        e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

}
