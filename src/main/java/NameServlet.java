import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/name")
public class NameServlet extends HttpServlet {
    private int counter;
    public void init(){
        counter = 0;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String name = request.getParameter("name");
        response.setContentType("text/html");
        counter++;
        PrintWriter out = response.getWriter();
        out.println("<h1> number of hits "+counter+"</h1>");

        if(name == null){
            out.println("<h1>Hello World</h1>");
        }else {
            out.println("<h1>"+name+"</h1>");
        }

    }

}
