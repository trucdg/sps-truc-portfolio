package com.google.sps.servlets;

import java.io.IOException;
import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList; 

/** Handles requests sent to the /quotes URL. Try running a server and navigating to /hello! */
@WebServlet("/quotes")
public class QuoteServlet extends HttpServlet {
    


  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    //Create and add quotes too the ArrayList
    ArrayList<String> quotes = new ArrayList<String>();

    quotes.add("Life is a dance. You learn as you go. Sometimes you lead, sometimes you follow.");
    quotes.add("Everyone you meet is fighting a battle you know nothing about. Be kind. Always!");
    quotes.add("The best view comes after the hardest climb!");
    quotes.add("Tough times never last, but tough people do!");


    //Convert the String Array to JSON string

    String json = convertToJsonUsingGson(quotes);

    //Send the JSON as the response

    response.setContentType("application/json;");
    response.getWriter().println(json);

  }


  private String convertToJsonUsingGson(ArrayList<String> quotes) {
    Gson gson = new Gson();
    String json = gson.toJson(quotes);
    return json;
  }
}

