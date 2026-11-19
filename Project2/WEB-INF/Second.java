import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class Second extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        PrintWriter pw = res.getWriter();

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String email = req.getParameter("email");

        res.setContentType("text/html;charset=UTF-8");

        pw.println("<h1>Post Request Based Service</h1>");
        pw.println("<h1>Name: " + name + "</h1>");
        pw.println("<h1>Age: " + age + "</h1>");
        pw.println("<h1>Email: " + email + "</h1>");

        pw.close();
    }
}