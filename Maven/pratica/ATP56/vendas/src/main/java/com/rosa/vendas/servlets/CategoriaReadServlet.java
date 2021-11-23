package com.rosa.vendas.servlets;

import java.io.*;
import com.rosa.vendas.dao.CategoriaDao;
import com.rosa.vendas.models.Categoria;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        CategoriaDao dao =  new CategoriaDao();
        for (Categoria model : dao.read()) {
            out.printf("%d | %s - %s\n", model.getId(), model.getNome(), model.getDescricao());
        }
    }
}
