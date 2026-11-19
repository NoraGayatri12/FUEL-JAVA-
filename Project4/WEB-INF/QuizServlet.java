import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuizServlet extends HttpServlet {

    String questions[] = {
        "What is Java?",
        "Which package contains Servlet?",
        "Which method handles POST request?",
        "Which object stores session data?",
        "Which protocol is used by Servlet?"
    };

    String options[][] = {
        {"Language", "Operating System", "Database", "Browser"},
        {"jakarta.servlet", "java.io", "java.sql", "java.lang"},
        {"doGet()", "doPut()", "doPost()", "main()"},
        {"HttpSession", "Cookie", "Request", "Response"},
        {"HTTP", "FTP", "SMTP", "TCP"}
    };

    // Correct answers (option index)
    int correct[] = {0, 0, 2, 0, 0};

    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {

        HttpSession session = req.getSession();

        Integer index = (Integer) session.getAttribute("index");

        if (index == null)
            index = 0;

        if (index >= questions.length) {
            res.sendRedirect("result");
            return;
        }

        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        pw.println("<html>");
        pw.println("<body>");
        pw.println("<center>");

        pw.println("<h2>Question " + (index + 1) + "</h2>");

        pw.println("<form action='quiz' method='post'>");

        pw.println("<p><b>" + questions[index] + "</b></p>");

        for (int i = 0; i < 4; i++) {
            pw.println("<input type='radio' name='answer' value='" + i + "' required>");
            pw.println(options[index][i] + "<br><br>");
        }

        pw.println("<input type='submit' value='Next'>");

        pw.println("</form>");

        pw.println("</center>");
        pw.println("</body>");
        pw.println("</html>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession();

        int index = (Integer) session.getAttribute("index");
        int score = (Integer) session.getAttribute("score");

        String ans = req.getParameter("answer");

        if (ans != null) {
            int selected = Integer.parseInt(ans);

            if (selected == correct[index]) {
                score++;
            }
        }

        index++;

        session.setAttribute("score", score);
        session.setAttribute("index", index);

        if (index >= questions.length) {
            res.sendRedirect("result");
        } else {
            res.sendRedirect("quiz");
        }
    }
}