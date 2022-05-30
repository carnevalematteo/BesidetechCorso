package com.corso;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTest {

    public static void main(String[] args) throws ParseException {

        JSONParser parser = new JSONParser();


        String json= "\t{\n" +
                "\t     \"source\" : \"web\",\n" +
                "\t     \"config\":\n" +
                "\t        {\n" +
                "\t        \"token\":\"AIzaSyDLI0pNUxRclWQ-lIA_qTwEBdE4QqBrzpc\",\n" +
                "\t        \"secretApp\":\"005938602341562117658:zdslc1vbgts\"\n" +
                "\t        }\n" +
                "\t\n" +
                "\t\n" +
                "\t}";





            JSONObject jsonObject = (JSONObject) parser.parse(json);
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("source");
            System.out.println(name);
    }
}
