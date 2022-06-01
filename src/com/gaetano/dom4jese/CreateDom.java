package com.gaetano.dom4jese;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class CreateDom {
    public static void main(String[] args) {
        try {
            Document document = DocumentHelper.createDocument();
            Element root = document.addElement( "studente" );
            Element cf = root.addElement("codice fiscale")
                    .addAttribute("num","data").addText("mrn3r4cvn");

            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer;
            writer = new XMLWriter( System.out, format );
            writer.write( document );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
