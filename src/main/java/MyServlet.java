import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.awt.SystemColor.text;

@WebServlet(urlPatterns={"/patients","/doctors"},loadOnStartup = 1)
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
            if (new String(req.getServletPath()).equals("/patients")){
                resp.getWriter().write("Hello patients");
            }
            if (new String(req.getServletPath()).equals("/doctors")) {
                resp.getWriter().write("Hello doctors");
            }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
