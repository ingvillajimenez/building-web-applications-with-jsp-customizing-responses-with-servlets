package com.skillsoft;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BookInfoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {

        String bName = req.getParameter("bname");

        String author = req.getParameter("author");

        req.setAttribute("updatedBName", bName.trim().toUpperCase());
        req.setAttribute("updatedAuthor", author.trim());

        RequestDispatcher rd = req.getRequestDispatcher("booksubmitconfirm");
        rd.forward(req, res);

    }

}