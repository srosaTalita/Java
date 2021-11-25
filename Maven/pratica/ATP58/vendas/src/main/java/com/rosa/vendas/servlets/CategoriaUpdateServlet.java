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

@WebServlet(urlPatterns = "/categoria/alterar")
public class CategoriaUpdateServlet extends HttpServlet{   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");

        Categoria model = new Categoria();
        model.setId(id);
        model.setNome(nome);
        model.setDescricao(descricao);

        CategoriaDao dao = new CategoriaDao();
        dao.update(model);

        RequestDispatcher rd = req.getRequestDispatcher("/alterar-sucesso.jsp");
        req.setAttribute("id", id);
        rd.forward(req, resp);
    }
}
