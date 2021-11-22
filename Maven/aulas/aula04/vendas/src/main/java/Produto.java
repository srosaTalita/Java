import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String nome = req.getParameter("nome");
        String parametroValor =req.getParameter("valor");

        if(parametroValor != null){
            float valor = Float.parseFloat(parametroValor);
            out.printf("Modulo Produtos - Prod = %s - %.2f reais", nome, valor);
        }
        else{
            out.printf("Modulo Produtos - Prod = %s", nome);
        }
    }
}
