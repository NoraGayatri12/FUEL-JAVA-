import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession();

        Integer score = (Integer) session.getAttribute("score");

        if(score == null) {
            score = 0;
        }

        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Quiz Result</title>");
        pw.println("</head>");

        pw.println("<body>");
        pw.println("<center>");

        pw.println("<h1>Quiz Completed</h1>");

        pw.println("<h2>Your Score : " + score + " / 5</h2>");

        if(score >= 3) {
            pw.println("<h3>Congratulations! You Passed</h3>");
        }
        else {
            pw.println("<h3>Better Luck Next Time</h3>");
        }

        pw.println("<br>");
        pw.println("<a href='login.html'>Try Again</a>");

        pw.println("</center>");
        pw.println("</body>");

        pw.println("</html>");
    }
}