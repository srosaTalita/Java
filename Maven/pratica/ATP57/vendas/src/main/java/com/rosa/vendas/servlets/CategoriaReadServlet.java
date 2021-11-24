package com.rosa.vendas.servlets;

import java.io.*;
import java.util.ArrayList;

import com.rosa.vendas.dao.CategoriaDao;
import com.rosa.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao =  new CategoriaDao();
        ArrayList<Categoria> categorias;

        String filtroNome = req.getParameter("filtro");
        if(filtroNome != null)
            categorias = dao.read(filtroNome);
        else
            categorias = dao.read();
        
        //Expedidor
        RequestDispatcher rd = req.getRequestDispatcher("/categoria-lista.jsp");
        req.setAttribute("categorias", categorias);
        rd.forward(req, resp);
    }
}
