
package pi;

import Entities.Flights;
import Model.FlightsFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class AdminScreen extends HttpServlet {
    @EJB
    private FlightsFacade flightsFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String src=request.getParameter("source");
        String des=request.getParameter("dest");
        int dur=Integer.parseInt(request.getParameter("dur"));
        int num_flight=Integer.parseInt(request.getParameter("nof"));
        String btn=request.getParameter("btn");
        //String fid=request.getParameter("fid");
        //out.print("nacnj");
        Flights f=new Flights();
        
        if("Save".equals(btn))
        {
            //out.print(" "+"kacjkak");
            f.setSourcecity(src);
            f.setDestinationcity(des);
            f.setDuration(dur);
            f.setNumFlights(num_flight);
            
            String ff="";
            ff=Character.toString(src.charAt(0))+Character.toString(des.charAt(0));
            f.setFid(ff);
            
            flightsFacade.create(f);
            
            RequestDispatcher rd=request.getRequestDispatcher("AdminScreen2.jsp");
            rd.forward(request, response);
        }
        else if("Clear".equals(btn))
        {
            request.setAttribute(request.getParameter("source"), "");
            request.setAttribute(request.getParameter("dest"), "");
            request.setAttribute(request.getParameter("dur"), "");
            request.setAttribute(request.getParameter("nof"), "");
            
            RequestDispatcher rd=request.getRequestDispatcher("adminScreen.jsp");
                        rd.forward(request, response);
        }
        
        
        try (PrintWriter out = response.getWriter()) {
             /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminScreen</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminScreen at " +src+dur+btn
        + request.getContextPath() + "</h1>");
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
