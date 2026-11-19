import java.io.*;
import java.util.HashMap;
import javax.servlet.*;
import javax.servlet.http.*;

public class Signup extends HttpServlet {

    // ✔ store users globally
    static HashMap<String, String> map = new HashMap<>();

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = res.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (map.containsKey(username)) {
            pw.println("<h1>User already exists </h1>");
        } else {
            map.put(username, password);

            pw.println("<h1>Signup Successful ✔</h1>");
            pw.println("<h2>Login Now</h2>");
            pw.println("<a href='login.html'><button>Login</button></a>");
        }

        pw.close();
    }
}