package com.gaetano.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.*;

public class JsLang {
    static Set<String> lista = null;
    public static final String CONFIG_FILE_NAME = "LanguageConfig.json";
    public static final String CONFIG_PATH_KEY = "CONFIG_PATH_KEY"; //contiente percorso d'ambiente

 public static void init() {
     String configPath = System.getProperty(CONFIG_PATH_KEY); //ricerca la proprietà indicato dalla (chiave), il valore della chiave
                                                                // il persorso
   //  Reader sourceStream;
     if(configPath==null){   //se il percorso è nullo
      InputStreamReader sourceStream = new InputStreamReader(JsLang.class.getResourceAsStream("/" + CONFIG_FILE_NAME));
     }                                                              //restituisce la risorsa richiesta sotto forma di ogg InputStream
     //legge i byte tutti assieme e converte nel carattere corrispondete

 }





    public static void main(String[] args) {

    }
    public static void it() throws IOException, ParseException {
        if(lista==null){
            JSONParser parser = new JSONParser();
            JSONArray documentJson = (JSONArray) parser.parse(new FileReader("src/com/gaetano/json/LanguageConfig.json"));

            for(int i = 0; i<documentJson.size(); i++){
            }
        }



    }
}
