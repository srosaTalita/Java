package com.rosa.vendas.servlets;

import java.io.*;
import java.util.*;
import com.rosa.vendas.models.Categoria;
import jakarta.servlet.RequestDispatcher;
import com.rosa.vendas.dao.CategoriaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao =  new CategoriaDao();
        ArrayList<Categoria> categorias;
        String nome = req.getParameter("nome");
        
        if(nome != null)
            categorias = dao.read(nome);
        else
            categorias = dao.read();
        
        req.setAttribute("categorias", categorias);
        RequestDispatcher rd = req.getRequestDispatcher("/categoria-lista.jsp"); 
        rd.forward(req, resp);
    }
}
