package com.rosa.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.rosa.vendas.dao.CategoriaDao;
import com.rosa.vendas.models.Categoria;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        
        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("desc"));

        model.setId(dao.insert(model));

        PrintWriter out = resp.getWriter();
        out.printf("Categoria: %s - %s", model.getNome(), model.getDescricao());
    }
}
