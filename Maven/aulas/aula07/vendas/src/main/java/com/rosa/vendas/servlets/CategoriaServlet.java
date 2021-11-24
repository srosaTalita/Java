package com.rosa.vendas.servlets;

import java.io.IOException;
import com.rosa.vendas.dao.CategoriaDao;
import com.rosa.vendas.models.Categoria;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria model = new Categoria();
        CategoriaDao dao = new CategoriaDao();

        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("desc"));
        int id = dao.insert(model);
        model.setId(id);

        req.setAttribute("id", model.getId());
        //Expedidor
        RequestDispatcher rd = req.getRequestDispatcher("sucesso.jsp");
        rd.forward(req, resp);

        // PrintWriter out = resp.getWriter();
        // out.printf("Nova categoria gerada com sucesso - Id: %d", id);
    }
}
