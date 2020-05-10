//package network;
//
//import netscape.javascript.JSObject;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.net.URLConnection;
//
//public class ParseJSONEx {
//    public static void main(String[] args) throws IOException {
//
//        JSONParser parser = new JSONParser();
//
//        try {
//            String apikey = "510e5bf40543a9b8e34f6e94791996ae"; //fill this in with the API key they email you
//            String bishkekweather = "https://api.openweathermap.org/data/2.5/weather?q=Bishkek,kg&APPID=";
//            URL url = new URL(bishkekweather + apikey); // URL to Parse
//            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
//
//            String inputLine;
//            while ((inputLine = in.readLine()) != null) {
//                JSONArray a = (JSONArray) parser.parse(inputLine);
//
//                // Loop through each item
//                for (Object o : a) {
//                    JSONObject tutorials = (JSONObject) o;
//
//                    Long id = (Long) tutorials.get("ID");
//                    System.out.println("Post ID : " + id);
//
//                    String title = (String) tutorials.get("post_title");
//                    System.out.println("Post Title : " + title);
//
//                    System.out.println("\n");
//                }
//            }
//            in.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
//}
