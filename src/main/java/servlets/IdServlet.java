package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/userid")
public class IdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if (id == null) {
            String path = req.getContextPath() + "/notfound";
            resp.sendRedirect(path);
        } else {
            resp.setContentType("text/html");
            PrintWriter pw = resp.getWriter();
            try {
                pw.println("<h1>id: " + id + "</h1>");
            } finally {
                pw.close();
            }
        }
    }
}
