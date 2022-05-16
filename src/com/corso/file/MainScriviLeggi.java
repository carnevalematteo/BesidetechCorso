package com.corso.file;

import java.io.IOException;

public class MainScriviLeggi {

    public static void main(String[] args) throws IOException {

        ScriviLeggi scrivi = new ScriviLeggi();

        scrivi.write("ciao");

        scrivi.readItem();
    }
}
