package QuestionController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import LoginBean.login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rupinder
 */
public class LoginPage extends HttpServlet {

   
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        if (session.isNew()) {
            String c1 = request.getParameter("Username");
            login name = new login();
            
            name.setName(c1);
            name.setScore(0);
            session.setAttribute("player", name);
            session.setAttribute("b0", "");
            session.setAttribute("b1", "");
            session.setAttribute("b2", "");
            session.setAttribute("b3", "");
            session.setAttribute("b4", "");
            session.setAttribute("b5", "");
            session.setAttribute("b6", "");
            session.setAttribute("b7", "");
            session.setAttribute("b8", "");
            session.setAttribute("b9", "");
            session.setAttribute("b10", "");
            session.setAttribute("b11", "");
            session.setAttribute("b12", "");
            session.setAttribute("b13", "");
            session.setAttribute("b14", "");
            session.setAttribute("b15", "");
            session.setAttribute("b16", "");
            session.setAttribute("b17", "");
            session.setAttribute("b18", "");
            session.setAttribute("b19", "");
            session.setAttribute("b20", "");
            session.setAttribute("b21", "");
            session.setAttribute("b22", "");
            session.setAttribute("b23", "");
            session.setAttribute("b24", "");
            RequestDispatcher view = request.getRequestDispatcher("questionGrid.jsp");
            view.forward(request, response);
        }
    }
}
