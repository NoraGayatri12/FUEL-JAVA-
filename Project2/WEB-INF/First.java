import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class First extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = res.getWriter();  

        pw.println("<h1>Get Request Based Service</h1>");

        pw.close();
    }
}