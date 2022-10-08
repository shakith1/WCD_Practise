
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Shakith
 */

@WebServlet(urlPatterns = {"D","/A"},
        initParams = {
            @WebInitParam(name = "age",value = "10")
        })
public class A extends HttpServlet {

    int x = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("HEllo");
//        super.doGet(req, resp);
//        resp.getWriter().write("OK");

//        x = x+1;
//        System.out.println(x);
//        
//        System.out.println(this);
//        System.out.println(req);
//        System.out.println(Thread.currentThread());
        String name = getInitParameter("name");
        System.out.println(name);

        String name1 = getServletConfig().getInitParameter("name");
        System.out.println(name);

        Enumeration<String> names = getInitParameterNames();
        while (names.hasMoreElements()) {
            String nextElement = names.nextElement();
            System.out.println(nextElement);
            System.out.println(getInitParameter(nextElement));
        }

    }

    @Override
    public void init() throws ServletException {
        System.out.println("OK");
    }

//    @Override 
//    public void init(ServletConfig config) throws ServletException {
//        System.out.println("A");
//    }
    @Override
    public void destroy() {
        System.out.println("Destroy");
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("AA");
//    }
}
