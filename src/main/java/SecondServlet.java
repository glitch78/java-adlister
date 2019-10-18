import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second-servlet")
public class SecondServlet extends HttpServlet {

    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("second-servlet");
        PrintWriter out = response.getWriter();
        out.println("<h1>Finished second servlet!!</>h1");
        out.println("<h1> second line of servlet practice</>");
    }

}


