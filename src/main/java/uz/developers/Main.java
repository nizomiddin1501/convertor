package uz.developers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import uz.developers.model.Currency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //dollar(USD), euro(EUR), yuan(CNY), so'm(UZS);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Valyutangizni kiritin ");
        String currencyName = scanner.next();
        System.out.println("Mablag'ni kiritin ");
        double amount = scanner.nextDouble();
        System.out.println("Ikkinchi valyutani kiritin ");
        String currencyName2 = scanner.next();
        getCurrency(currencyName,amount,currencyName2);

    }

    public static void getCurrency(String currencyName,double amount,String currencyName2) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            URL url = new URL("https://cbu.uz/oz/arkhiv-kursov-valyut/json/");
            URLConnection urlConnection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            Type type = new TypeToken<ArrayList<Currency>>() {}.getType();
            ArrayList<Currency> currencies = gson.fromJson(reader, type);

            for (int i = 0; i < currencies.size(); i++) {
                String ccy = currencies.get(i).getCcy();
                if (ccy.equals(currencyName)) {
                    System.out.println(amount+" "+currencies.get(i).getCcyNm_UZC()+" ===> "+(currencies.get(i).getRate())*amount+" uzbek so'mi ga teng");

                }else if (currencyName.equals("so'm")||currencyName.equals("UZS")){
                    if (currencyName2.equals(currencies.get(i).getCcy())){
                        System.out.println(amount+" uzbek so'mi ====> " +(amount/currencies.get(i).getRate())+" "+currencies.get(i).getCcyNm_UZC()+" ga teng ");
                    }
                }
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
