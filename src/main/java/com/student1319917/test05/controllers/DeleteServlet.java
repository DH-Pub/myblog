package com.student1319917.test05.controllers;

import com.student1319917.test05.service.ProductBean;
import com.student1319917.test05.service.ProductJPA;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductJPA productJPA = new ProductBean();
        String[] values = req.getParameterValues("delete");
        for (String value : values) {
            productJPA.deleteProduct(Integer.parseInt(value));
        }
        resp.sendRedirect(req.getContextPath() + "/");
    }
}
