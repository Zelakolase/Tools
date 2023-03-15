package test;

import java.util.HashMap;

public class JSONParser {
    public static void main(String[] args) {
        HashMap<String, String> JSONStructure = new HashMap<>() {{
            put("Username", "Abdelfattah Alsisi");
            put("UserID", "0");
        }};
        System.out.println("HashMap to String -> " + tools.JSONParser.HMQ(JSONStructure));

        String JSONString = "{\"UserID\":\"0\"}";
        System.out.println("String to HashMap -> " + tools.JSONParser.QHM(JSONString));

        HashMap<String, String> NestedJSONStructure = new HashMap<>() {{
            put("UsernamesIDs", tools.JSONParser.HMQ(new HashMap<>() {{
                put("Abdelfattah Alsisi", "0");
                put("Lex Fridman", "1");
            }}));
            put("status", "success");
        }};
        System.out.println("Nested JSON HashMap to String -> "+tools.JSONParser.HMQ(NestedJSONStructure));
    }
}
