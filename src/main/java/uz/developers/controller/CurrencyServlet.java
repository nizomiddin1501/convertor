package uz.developers.controller;

import org.json.JSONArray;
import uz.developers.service.CurrencyService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/convert")
public class CurrencyServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String amountStr = request.getParameter("amount");
        String fromCurrency = request.getParameter("fromCurrency");
        String toCurrency = request.getParameter("toCurrency");
        double amount = Double.parseDouble(amountStr);
        double fromRate = 0.0;
        double toRate = 0.0;

        try {
            JSONArray exchangeRates = CurrencyService.getExchangeRates();
            fromRate = CurrencyService.getExchangeRate(fromCurrency, exchangeRates);
            toRate = CurrencyService.getExchangeRate(toCurrency, exchangeRates);
        } catch (Exception e) {
            e.printStackTrace();
        }
        double convertedAmount;
        if (toCurrency.equals("UZS")) {
            convertedAmount = amount * fromRate;
        } else {
            convertedAmount = (amount / fromRate) * toRate;
        }
        request.setAttribute("amount", amount);
        request.setAttribute("fromCurrency", fromCurrency);
        request.setAttribute("toCurrency", toCurrency);
        request.setAttribute("convertedAmount", convertedAmount);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }


}
