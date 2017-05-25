
package pi;

import Entities.Scheduledflights;
import Model.ScheduledflightsFacade;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsersDisplay extends HttpServlet {
    @EJB
    private ScheduledflightsFacade scheduledflightsFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            
        String src=request.getParameter("source");
        String des=request.getParameter("dest");
        String d=request.getParameter("dur");
        String btn=request.getParameter("btn");
        
        out.print("zbxhjchiWEEB");
        SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
        Date dt1=format1.parse(d);
        DateFormat format2=new SimpleDateFormat("EEEE"); 
        String finalDay=format2.format(dt1);   
        String day=finalDay.toLowerCase();
        String dd=day.substring(0, Math.min(day.length(), 3));
        
        List<Scheduledflights> ss=scheduledflightsFacade.findAll();
        List<Scheduledflights> new_list = new ArrayList<Scheduledflights>();
                            
        
        
                //out.print("zbxhjchiWEEB");

        if("Search".equals(btn))
        {
            for (Scheduledflights sf : ss) 
            {
                //out.print(finalDay);
                   if((sf.getSourcecity().equals(src))&&(sf.getDestination().equals(des))&&(sf.getDay().equals(dd)))
                    {
                        new_list.add(sf);
                        out.print(sf.getSourcecity()+" "+sf.getDestination()+" "+sf.getArrivaltime()+" "+sf.getDeparturetime());
                       
                    }
            }
           
           
        }
        else if("Clear".equals(btn))
        {
            request.setAttribute(request.getParameter("source"), "");
            request.setAttribute(request.getParameter("dest"), "");
            request.setAttribute(request.getParameter("dur"), "");
           
            RequestDispatcher rd=request.getRequestDispatcher("offers.jsp");
                        rd.forward(request, response);
        }
        
        request.getSession().setAttribute("userslist", new_list);
        RequestDispatcher rd=request.getRequestDispatcher("userdisplay.jsp");
                       rd.forward(request, response);
                       
        
            /* TODO output your page here. You may use following sample code. */
//            SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
//  Date dt1=format1.parse(d);
//  DateFormat format2=new SimpleDateFormat("EEEE"); 
//  String finalDay=format2.format(dt1);                    
           
        }
    }

    
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(UsersDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(UsersDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
     public String getServletInfo() {
        return "Short description";
    }
}
