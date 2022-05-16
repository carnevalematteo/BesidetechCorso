package com.corso.file;

import java.io.IOException;

public class MainScriviLeggi {

    public static void main(String[] args) throws IOException {

        ScriviLeggi scrivi = new ScriviLeggi();

        //scrivi.write("host=xxx.xxx.xxx");
       // scrivi.write("lang=it");

        //scrivi.readItem();

        //scrivi.splitReadFile();

        String result = scrivi.getConfig("host2");

        System.out.println(result);
    }
}
