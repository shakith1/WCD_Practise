
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
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
//@WebServlet(name = "A",urlPatterns = {"/A","/B"})
public class A extends HttpServlet{
int x = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("HEllo");
//        super.doGet(req, resp);
//        resp.getWriter().write("OK");

        x = x+1;
        System.out.println(x);
        
        System.out.println(this);
        System.out.println(req);
        System.out.println(Thread.currentThread());
        
    }

    @Override
    public void init() throws ServletException {
        System.out.println("OK");
    }

//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        System.out.println("A");
//    }

    
    
    
}
