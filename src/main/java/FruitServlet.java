import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fruit")
public class FruitServlet extends HttpServlet {

    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       String fruit = request.getParameter("fruit");
         response.setContentType("text/html");
//        response.setContentType("fruit");
        PrintWriter out = response.getWriter();
        out.println("<h1>Finished second servlet!!" +
                "<p>Here is a " +fruit+"</p>");
        if(fruit.equalsIgnoreCase("banana")){
            out.println("<p> Here is a " + fruit+ "<p/>");
        }
        else {
            out.println("<p> Here is a " + fruit + "<p>");
        }
    }
}
