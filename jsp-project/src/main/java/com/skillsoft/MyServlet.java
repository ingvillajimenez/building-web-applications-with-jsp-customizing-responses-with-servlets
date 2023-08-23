package com.skillsoft;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "myServlet", urlPatterns = "/my-servlet")
public class MyServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello! I am a servlet. I am here to serve.";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

//For Apache Tomcat version less than 10
//javax.servlet-api
//https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api/4.0.1

// For older Tomcat versions
// Replace jakarta with javax