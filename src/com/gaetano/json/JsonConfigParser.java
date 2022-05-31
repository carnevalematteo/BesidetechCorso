package com.gaetano.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonConfigParser {
    private static HashMap <String,HashMap<String,String>> lista = null;
    public static void main(String[] args) throws IOException, ParseException {

       getSourceConfig("twitter", "token");
        getSourceConfig("twitter", "secretToken");
    }
    public static void init() {
        JSONParser parser = new JSONParser();
        JSONObject OBJ = new JSONObject();




        try{
            JSONArray documentJson = (JSONArray) parser.parse(new FileReader("src/com/gaetano/json/ApiConfig.json"));

            lista = new HashMap<>();


            for(int i = 0; i < documentJson.size(); i++){

                JSONObject elemObj = (JSONObject) documentJson.get(i);
                lista.put((String) elemObj.get("source"), (HashMap<String, String>) elemObj.get("config"));

            }
         //   System.out.println(lista.get("twitter"));
          //  System.out.println(lista.get("twitter").get("token"));

        }
            catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static String getSourceConfig(String channel, String value) throws IOException, ParseException {
        if(lista == null){
            init();
            System.out.println("prima volta che vengo invocato inizializzo la mappa");

        } else {
            System.out.println("non è la prima volta che vengo invocato , non reinizializzo ");
        }
            return lista.get(channel).get(value);

    }


}

