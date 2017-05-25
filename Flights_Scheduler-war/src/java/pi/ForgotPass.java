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
public class ForgotPass extends HttpServlet {
    @EJB
    private UsersFacade usersFacade;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       int uid=(int) request.getSession().getAttribute("uname");
        //out.print(uid);
        String pass=request.getParameter("pass");
        String cpass=request.getParameter("cpass");
        
        Users u=new Users();
        
        //usersFacade.edit(u);
        u=usersFacade.find(uid);
        try (PrintWriter out = response.getWriter()) {
            if(pass.equals(cpass))
            {
                
                String uu=u.getPassword();
                //out.print(uid+" "+uu);
                u.setPassword(pass);
                usersFacade.edit(u);
                RequestDispatcher rd=request.getRequestDispatcher("PassChanged.jsp");
                rd.forward(request, response);

                
                //out.print(uuu+" "+u2);
                //out.print("Password changed successfully!!");
            }
        else
            {
                RequestDispatcher rd=request.getRequestDispatcher("forgotPass.jsp");
                rd.forward(request, response);

            }
        }
          //  out.print(uid+" "+pass+cpass);
            //out.print("fbjkbf.a");
        
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
