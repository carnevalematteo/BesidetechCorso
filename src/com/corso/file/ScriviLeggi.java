package com.corso.file;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ScriviLeggi {

public void write(String sentence) throws IOException {
    String trainingFullPath = "C:\\Users\\carne\\db1.txt";
    String contentToAdd = "\r\n" + sentence;
    Files.write(
            Paths.get(trainingFullPath),
            contentToAdd.getBytes(),
            StandardOpenOption.APPEND);


}


    public  void readItem() throws IOException {
        String trainingFullPath = "C:\\Users\\carne\\db1.txt";
        List<String> lines =Files.readAllLines(Paths.get(trainingFullPath));

        for(String s : lines) {
            System.out.println(s);
        }
    }
}
