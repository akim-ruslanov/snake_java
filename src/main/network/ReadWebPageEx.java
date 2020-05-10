//package network;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//import org.json.simple.JSONObject;
//
//
//public class ReadWebPageEx {
//
//    public static void main(String[] args) throws MalformedURLException, IOException {
//        BufferedReader br = null;
//        BufferedReader brBishkek = null;
//        try {
//            String apikey = "510e5bf40543a9b8e34f6e94791996ae"; //fill this in with the API key they email you
//            String bishkekweather = "https://api.openweathermap.org/data/2.5/weather?q=Bishkek,kg&APPID=";
//            String bishkekURL = bishkekweather + apikey;
//            URL urlBishkek = new URL(bishkekURL);
//            brBishkek = new BufferedReader(new InputStreamReader(urlBishkek.openStream()));
//            String line;
//            String lineBishkek;
//
//            StringBuilder sb = new StringBuilder();
//            StringBuilder sbBishkek = new StringBuilder();
//            while ((line = br.readLine()) != null) {
//                sb.append(line);
//                sb.append(File.separator);
//            }
//
//
//            System.out.println(sb);
////            JSONObject json = new JSONObject();
//            while ((lineBishkek = brBishkek.readLine()) != null) {
//                sbBishkek.append(lineBishkek);
//                sbBishkek.append(System.lineSeparator());
//            }
//            System.out.println(sbBishkek);
//            ArrayList<String> array = new ArrayList<>();
//            String[] strings = sb.toString().split(",");
//            for (String i : strings) {
//                System.out.println(i);
//            }
//        } finally {
//
//            if (br != null) {
//                br.close();
//                brBishkek.close();
//            }
//        }
//    }
//}