package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

        //get the value entered in the form.
        String textValue = request.getParameter("text-input");

        //print the value so you can see it in the server logs.
        System.out.println("You submitted" + textValue);

        //Write the value to the response so the user can see it.
        response.getWriter().print("You submitted:" + textValue);
        
        //Redirect the client
        response.sendRedirect("https://google.com");

    }

    
}
