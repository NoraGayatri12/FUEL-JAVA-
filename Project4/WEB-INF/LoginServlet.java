import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        HttpSession session=req.getSession();
        String username=req.getParameter("username");
        session.setAttribute("score",0);
        session.setAttribute("index",0);
        res.sendRedirect("quiz");
    }
}