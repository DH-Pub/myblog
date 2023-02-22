package com.student1319917.test05.controllers;

import com.student1319917.test05.service.ProductBean;
import com.student1319917.test05.service.ProductJPA;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/","/index"})
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductJPA productJPA = new ProductBean();
        req.setAttribute("products", productJPA.findAll());
        req.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
    }
}
