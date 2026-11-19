import javax.servlet.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends GenericServlet{
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        pw.println("<center><h1> This is My First Servlet</h1></center>");
        pw.close();

    }
    
}