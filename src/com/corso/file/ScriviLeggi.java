package com.corso.file;


import java.awt.*;
import java.io.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;

public class ScriviLeggi {

public void write(String sentence) throws IOException {
    String trainingFullPath = "C:\\Users\\matte\\split.txt";
        String contentToAdd = "\r\n" + sentence;
        Files.write(
                Paths.get(trainingFullPath),
                contentToAdd.getBytes(),
                StandardOpenOption.APPEND);


}

    public  void readItem() throws IOException {
        String trainingFullPath = "C:\\Users\\matte\\db1.txt";
        List<String> lines =Files.readAllLines(Paths.get(trainingFullPath));
        for(String s : lines) {
            System.out.println(s);
        }
    }


    public void splitReadFile() throws IOException {
        String trainingFullPath = "C:\\Users\\matte\\split.txt";
        List<String> content = Files.readAllLines(Paths.get(trainingFullPath));
        //a,b,c,d,e
        String result ="";
        for(String s : content){
            result = result.concat(s);
        }

        String [] word = result.split(",");

        for(String s : word){
            System.out.println(s);
        }

    }


    public String getConfig(String daRicercare) throws IOException {
        Properties conf = new Properties();
        String trainingFullPath = "C:\\Users\\matte\\split.txt";
        InputStream is =new FileInputStream(trainingFullPath);
        conf.load(is);
        String result = conf.getProperty(daRicercare,"non trovato");
        return result;


    }

}
