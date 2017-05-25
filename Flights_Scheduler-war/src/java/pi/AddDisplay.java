
package pi;

import Entities.Flights;
import Model.FlightsFacade;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Shubham
 */
public class AddDisplay extends HttpServlet {
    @EJB
    private FlightsFacade flightsFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String radio=request.getParameter("group1");
        try (PrintWriter out = response.getWriter())
        {
            //out.print(radio);
            if("add".equals(radio))
            {
                RequestDispatcher rd=request.getRequestDispatcher("adminScreen.jsp");
                rd.forward(request, response);
            }
            else if("display".equals(radio))
            {
                //out.print("bzxb kj");
                List<Flights> flights= flightsFacade.findAll();
                request.setAttribute("list", flights);
//                for(int i=0;i<flights.size();i++)
//                {
//                  out.print(flights.get(i).getSourcecity());
//                  
//                } 
                RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
                rd.forward(request, response);
                
            }       
        }
        catch(Exception e)
        {
            out.print("ERRor message");
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
