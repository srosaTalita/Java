package com.rosa.vendas.servlets;
import java.io.*;
import com.rosa.vendas.models.Produto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Produto prod = new Produto();
        
        String parametroId = req.getParameter("id");
        prod.setNome(req.getParameter("nome"));
        String parametroValor = req.getParameter("valor");

        PrintWriter out = resp.getWriter();
        
        if (parametroId != null) {
            if(parametroValor != null){
                
                prod.setId(Integer.parseInt(parametroId));
                prod.setValor(Float.parseFloat(parametroValor));
                out.printf("%d - %s | %.2f", prod.getId(), prod.getNome(), prod.getValor());
            }
            else{
                prod.setId(Integer.parseInt(parametroId));
                out.printf("%d - %s", prod.getId(), prod.getNome());
            }
        }
        else{
            out.printf("%s", prod.getNome());
        }
    }
}