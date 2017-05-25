/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi;

import Entities.Flights;
import Entities.Scheduledflights;
import Model.FlightsFacade;
import Model.ScheduledflightsFacade;
import Model.Scheduling;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Schedule extends HttpServlet {
    @EJB
    private ScheduledflightsFacade scheduledflightsFacade;
    @EJB
    private Scheduling scheduling;
    @EJB
    private FlightsFacade flightsFacade;
    public static int time=1;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        List<Flights> list=(List<Flights>) request.getSession().getAttribute("new_list");
        
         
        try (PrintWriter out = response.getWriter()) {
            // out.print("ca aknvk");
           Map<Integer, List<Flights>> data=scheduling.storeDayWise(list);           
           
           List<Scheduledflights> ss=new ArrayList<>();
               
           String day="";
           int t=time,start,end,shr,smin,ehr,emin;
           for(int i=1;i<=data.size();i++)
           {
               List<Flights> ff=data.get(i);
               
               if(i==1)day="mon";
               else if(i==2)day="tue";
               else if(i==3)day="wed";
               else if(i==4)day="thu";
               else if(i==5)day="fri";
               else if(i==6)day="sat";
               else if(i==7)day="sun";
               
               
               t=time;
               shr=0;
               smin=0;
               ehr=0;
               emin=0;
               for(int j=0;j<ff.size();j++)
               {
                   Scheduledflights sf=new Scheduledflights();
                    start=t;
                    t+=ff.get(j).getDuration();
                    end=t;
                    if(start>60)
                    {
                        shr=start/60;
                        smin=start-(shr*60);
                    }
                    if(end>60)
                    {
                        ehr=end/60;
                        emin=end-(ehr*60);
                    }
                    if(start<60)
                    {
                        shr=0;
                        smin=start;
                    }
                    if(end<60)
                    {
                        ehr=0;
                        emin=end;
                    }
                    
                    
                    sf.setDay(day);
                    sf.setSourcecity(ff.get(j).getSourcecity());
                    sf.setDestination(ff.get(j).getDestinationcity());
                    sf.setArrivaltime(shr+":"+smin);
                    sf.setDeparturetime(ehr+":"+emin);
                    sf.setId(ff.get(j).getDestinationcity()+sf.getArrivaltime()+sf.getDay());
                    
                    
                    ss.add(sf);
                    //scheduledflightsFacade.create(sf);
           
                    //out.print(" ..."+shr+"  ..."+smin+" ..."+ehr+" ...."+emin);
                    //out.print(sf.getDestination());
                    //out.print(ss.get(0).getDestination());
               }
           }
                    
                    
           request.getSession().setAttribute("display_list", ss);
           RequestDispatcher rd=request.getRequestDispatcher("tables.jsp");
                        rd.forward(request, response);
           
           }

    
    }
      /*// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
    

