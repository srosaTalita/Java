package com.rosa.vendas2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class Categoria extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.printf("<h1>Cadastro de Categorias: %s</h1>", nome);
		out.println("</body>");
		out.println("</html>");
	}
}
