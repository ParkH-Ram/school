package _20_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class _2_money {
    public static void main(String[] args) {
        String apiKey = "YOUR_API_KEY";
        String symbol = "AAPL"; // Apple 주식
        String apiUrl = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + symbol + "&apikey=" + apiKey;

        try {
            URL url = new URL(apiUrl);
            URLConnection connection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            JSONObject globalQuote = jsonObject.getJSONObject("Global Quote");
            double price = globalQuote.getDouble("05. price");
            System.out.println(symbol + " 가격: " + price);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}