/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
              response.setContentType("text/html;charset=UTF-8");
             String s=request.getParameter("NAME");
             
            Cookie c=new Cookie("uname",s);
            response.addCookie(c);
            out.println("Welocme "+s);
            out.println("--------------------------");
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
          out.println("<form action='Servlet2' method='GET'>");
           out.println("<input type='submit' value='Go To Servlet2'>");
            out.println("</form>");
            out.println("</body></html>");
    }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
     
}
