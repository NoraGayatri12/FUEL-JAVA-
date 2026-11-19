package Login;
import java.io.*;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {

    public static HashMap<String, String> map = new HashMap<>();

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (map.containsKey(username) && map.get(username).equals(password)) {
            pw.println("<h1>Login Successful...</h1>");
            pw.println("<h2>Hello " + username + "</h2>");
        } else {
            pw.println("<h1>Login Failed</h1>");
        }
    }
}