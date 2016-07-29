/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amitoshseu
 */
public class LoginServlet extends HttpServlet {

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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginService loginService = new LoginService();
        boolean isValidUser = loginService.authenticate(username, password);
        if(isValidUser){
            User user = loginService.getUserDetails(username);
            System.out.println("*" + user.getFullname());
            request.getSession().setAttribute("user", user);
            response.sendRedirect("greetings.jsp");
        }else {
            request.getSession().setAttribute("message", "Incorrect username/password");
            response.sendRedirect("index.jsp");
        }
        
        
        /*
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            LoginService loginservice = new LoginService();
            boolean isValidUser = loginservice.authenticate(username, password);
            if(isValidUser)
                out.println("<h1>Hello," + request.getParameter("username") + "!</h1>");
            else  out.println("<h1>Sorry we cannto let you in</h1>");
//            if(username.equals("amitoshseu"))
//                out.println("<h1>Hello," + request.getParameter("username") + "!</h1>");
//            else
//                out.println("<h1>Sorry we cannto let you in</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        */
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
