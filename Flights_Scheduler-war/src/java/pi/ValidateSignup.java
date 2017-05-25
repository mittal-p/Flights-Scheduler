
package pi;

import Entities.Users;
import Model.UsersFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shubham
 */
public class ValidateSignup extends HttpServlet {
    @EJB
    private UsersFacade usersFacade;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String radio=request.getParameter("group1");
        String name=request.getParameter("name");
        int uid=Integer.parseInt(request.getParameter("uid"));
        String pass=request.getParameter("pass");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        
        Users u=new Users();
         if("admin".equals(radio))
         {
             u.setType("admin");
         }
         else if("supervisor".equals(radio))
         {
             u.setType("supervisor");
         }
        
        
        u.setName(name);
        u.setUserid(uid);
        u.setPassword(pass);
        u.setEmail(email);
        u.setAddress(address);
        
        usersFacade.create(u);
        
        RequestDispatcher rd=request.getRequestDispatcher("start.jsp");
                            rd.forward(request, response);

        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValidateSignup</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ValidateSignup at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
