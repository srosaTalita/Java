package com.rosa.vendas.servlets;

import java.io.IOException;

import com.rosa.vendas.dao.CategoriaDao;
import com.rosa.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/buscarId")
public class CategoriaSearchIdServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        int id = Integer.parseInt(req.getParameter("id"));
        Categoria model = dao.readById(id);

        RequestDispatcher rd = req.getRequestDispatcher("/alterar.jsp");
        req.setAttribute("model", model);
        rd.forward(req, resp);
    }
}
