package com.example.selenium_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@WebServlet("/course")
public class CourseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	WebDriverManager.chromedriver().setup();
        String name = request.getParameter("studentName");
        String degree = request.getParameter("studentDegree");
        String course = request.getParameter("studentCourse");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Student Details</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Degree: " + degree + "<br>");
        out.println("Course: " + course);
    }
}
