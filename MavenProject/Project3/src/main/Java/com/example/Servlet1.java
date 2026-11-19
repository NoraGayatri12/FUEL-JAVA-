import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servlet1 extends HttpServlet{
    protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        PrintWriter pw=res.getWriter();
        pw.println("<center><h1>This Servlet Is Created Using Maven....</h1></center>");
        pw.close();
    }
}