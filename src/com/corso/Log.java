package com.corso;

import com.corso.file.MainScriviLeggi;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {

    public static void main(String[] args) {

        Logger LOGGER = Logger.getLogger(MainScriviLeggi.class.getName());
        FileHandler fh;

        try {

            // This block configure the logger with handler and formatter
            fh = new FileHandler("C:\\Users\\matte\\split.log");
            LOGGER.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            LOGGER.info("My first log");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        LOGGER.info("Hi How r u?");


    }
}
