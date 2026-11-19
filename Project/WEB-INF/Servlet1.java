import javax.servlet.*;
import java.io.*;

public class Servlet1 extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        // Set response type
        res.setContentType("text/html");

        // Get PrintWriter object
        PrintWriter pw = res.getWriter();

        // Send HTML response
        pw.write("<h1>This is my code</h1>");

        // Close the writer
        pw.close();
    }
}