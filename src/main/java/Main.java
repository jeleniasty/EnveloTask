
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static final String RESET = "\033[0m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";

    public static void main(String[] args) {
        KanyeQuote kanyeQuote = new KanyeQuote();
        kanyeQuote.quote();

        SearchNumber searchNumber = new SearchNumber();
        int[] numbers = {1001,999,843,777,543,439,430, 325, 324,292,111,110, 93, 84, 74,43,40,23,12,10,1,0,-1,-13,-123,-432,-567,-954,-1009};
        System.out.println(searchNumber.doSearch(324, numbers));
    }
}
