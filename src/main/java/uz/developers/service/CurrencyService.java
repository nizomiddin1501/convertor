package uz.developers.service;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class CurrencyService {


    private static final String EXCHANGE_RATE_URL = "https://cbu.uz/oz/arkhiv-kursov-valyut/json/";

    public static JSONArray getExchangeRates() throws Exception {
        URL url = new URL(EXCHANGE_RATE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();

        return new JSONArray(content.toString());
    }

    public static double getExchangeRate(String currencyCode, JSONArray exchangeRates) {
        for (int i = 0; i < exchangeRates.length(); i++) {
            JSONObject obj = exchangeRates.getJSONObject(i);
            if (obj.getString("Ccy").equalsIgnoreCase(currencyCode)) {
                return obj.getDouble("Rate");
            }
        }
        return 0.0;
    }



}
