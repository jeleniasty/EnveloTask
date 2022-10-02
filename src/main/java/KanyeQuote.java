import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class KanyeQuote {

    public final String RESET = "\033[0m";
    public final String RED_BOLD = "\033[1;31m";
    public final String GREEN_BOLD = "\033[1;32m";


    public void quote() {

        Scanner userInputScanner = new Scanner(System.in);
        ArrayList<String> quotesArray = new ArrayList<>();

        while (true) {
            String userInput = userInputScanner.nextLine();
            if (userInput.equals("next")) {
                try {
                    URL url = new URL("https://api.kanye.rest/");

                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");
                    conn.connect();

                    int responseCode = conn.getResponseCode();

                    if (responseCode != 200) {
                        throw new RuntimeException("HttpResponseCode: " + responseCode);
                    } else {

                        StringBuilder inf = new StringBuilder();
                        Scanner urlScanner = new Scanner(url.openStream());

                        while (urlScanner.hasNext()) {
                            inf.append(urlScanner.nextLine());
                        }
                        urlScanner.close();

                        JSONParser parser = new JSONParser();
                        JSONObject jsonObject = (JSONObject) parser.parse(String.valueOf(inf));
                        String strQuote = (String) jsonObject.get("quote");

                        if (quotesArray.isEmpty()) {
                            quotesArray.add(strQuote);
                        } else {
                            for (int i = 0; i < quotesArray.size(); i++) {
                                if (strQuote.equals(quotesArray.get(i))) {
                                    System.out.println("Kanye already said this. Type " + GREEN_BOLD + "next " + RESET + "or " + RED_BOLD + "end." + RESET);
                                    break;
                                }
                            }
                            quotesArray.add(strQuote);
                        }

                        System.out.println(strQuote);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (userInput.equals("end")) {
                break;
            } else {
                System.out.println("Please type valid input: " + GREEN_BOLD + "next " + RESET + "or " + RED_BOLD + "end." + RESET);
            }
        }
    }
}
