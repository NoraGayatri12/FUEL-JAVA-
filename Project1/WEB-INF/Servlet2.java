import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet{
    protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

        PrintWriter pw=res.getWriter();
        pw=res.getWriter();  

        res.setContentType("text/html");
        pw.println("<center><h1>This is My second Servlet</h1></center>");
        
        pw.close();
    }
}