package com.example.selenium_demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;   // ← add
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hobby")   // ← ADD THIS (routing happens here)
public class HobbyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String hobby = request.getParameter("hobby");

        response.setContentType("text/html");

        response.getWriter().println("<h2>Your Hobby: " + hobby + "</h2>");
    }
}
