/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi;

import Entities.Flights;
import Entities.Users;
import Model.FlightsFacade;
import Model.UsersFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
public class ValidateLogin extends HttpServlet {
    @EJB
    private FlightsFacade flightsFacade;
    @EJB
    private UsersFacade usersFacade;

    
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String radio=request.getParameter("group1");
        int uid=Integer.parseInt(request.getParameter("username"));
        String pass=request.getParameter("password");
        
        Users u=new Users();
        u=usersFacade.find(uid);
        
        String name=u.getName();
        String type=u.getType();
        String p=u.getPassword();
        //String email=u.getEmail();
        //out.println(name+email);
        request.setAttribute("myname", name);
        try (PrintWriter out = response.getWriter()) {
            if(p.equals(pass))
            {
                
                if(type.equals(radio))
                {
                    if("admin".equals(radio))
                        {
                            RequestDispatcher rd=request.getRequestDispatcher("adminScreen.jsp");
                            rd.forward(request, response);

                        }

                    else if("supervisor".equals(radio))
                        {
                            String src=u.getAddress();
                            //out.print(src);
                            List<Flights> list=flightsFacade.findAll();
                            
                            List<Flights> new_list = new ArrayList<Flights>();
                            
                        for (Flights list1 : list) {
                            if (src.equals(list1.getSourcecity()))
                            {
                                //out.print(list1.getDestinationcity());
                                new_list.add(list1);
                                
                            }
                            
                        }   
                      
                         // out.print("dnanck");
//                        
//                        for(Flights ff:new_list)
//                        {
//                            out.print(ff.getDestinationcity());
//                            out.print(ff.getNumFlights());
//                        }

                        
                        
                        request.getSession().setAttribute("new_list", new_list);
                        
                        RequestDispatcher rd=request.getRequestDispatcher("supervisorScreen.jsp");
                        rd.forward(request, response);
                        
                        }
                }
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("incorrectPass.jsp");
                rd.forward(request, response);
            }
            
        }
        catch(Exception e)
        {
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
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
