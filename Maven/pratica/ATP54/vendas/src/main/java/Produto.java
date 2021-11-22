import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parametroId = req.getParameter("id");
        String nome = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");

        PrintWriter out = resp.getWriter();
        
        if (parametroId != null) {
            if(parametroValor != null){
                int id = Integer.parseInt(parametroId);
                Float valor = Float.parseFloat(parametroValor);
                out.printf("%d - %s | %.2f", id, nome, valor);
            }
            else{
                int id = Integer.parseInt(parametroId);
                out.printf("%d - %s", id, nome);
            }
        }
        else{
            out.printf("%s", nome);
        }
    }
}