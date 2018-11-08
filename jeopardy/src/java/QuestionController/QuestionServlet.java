package QuestionController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import LoginBean.ArrayClass;
import LoginBean.Question;
import com.contacts.dao.DAO;
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
public class QuestionServlet extends HttpServlet {
    int i=0;
   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             
        
        HttpSession session = request.getSession();
        
        int questionNumber = Integer.parseInt(request.getParameter("1"));
        session.setAttribute("selection", questionNumber);
        String cat="";
        int value=0;
        if(questionNumber/5==0){
            cat="Computer";
        }else if(questionNumber/5==1){
            cat="Earth";
        }else if(questionNumber/5==2){
            cat="Plants";
        }else if(questionNumber/5==3){
            cat="Games";
        }else if(questionNumber/5==4){
            cat="Human Body";
        }
        
        if(questionNumber%5==0){
           value=100;
        }else if(questionNumber%5==1){
            value=200;
        }else if(questionNumber%5==2){
           value=300;
        }else if(questionNumber%5==3){
          value=400;
        }else if(questionNumber%5==4){
           value=500;
        }
        
        DAO dd = new DAO();
        Question q = dd.getConatct(cat, value);
        
        request.setAttribute("correctQuestion", q);
        if(questionNumber == 0){
        session.setAttribute("b0", "disabled");
        i++;
        }else if(questionNumber == 1){
        session.setAttribute("b1", "disabled");
        i++;
        }else if(questionNumber == 2){
        session.setAttribute("b2", "disabled");
        i++;
        }else if(questionNumber == 3){
        session.setAttribute("b3", "disabled");
        i++;
        }else if(questionNumber == 4){
        session.setAttribute("b4", "disabled");
        i++;
        }else if(questionNumber == 5){
        session.setAttribute("b5", "disabled");
        i++;
        }else if(questionNumber == 6){
        session.setAttribute("b6", "disabled");
        i++;
        }else if(questionNumber == 7){
        session.setAttribute("b7", "disabled");
        i++;
        }else if(questionNumber == 8){
        session.setAttribute("b8", "disabled");
        i++;
        }else if(questionNumber == 9){
        session.setAttribute("b9", "disabled");
        i++;
        }else if(questionNumber == 10){
        session.setAttribute("b10", "disabled");
        i++;
        }else if(questionNumber == 11){
        session.setAttribute("b11", "disabled");
        i++;
        }else if(questionNumber == 12){
        session.setAttribute("b12", "disabled");
        i++;
        }else if(questionNumber == 13){
        session.setAttribute("b13", "disabled");
        i++;
        }else if(questionNumber == 14){
        session.setAttribute("b14", "disabled");
        i++;
        }else if(questionNumber == 15){
        session.setAttribute("b15", "disabled");
        i++;
        }else if(questionNumber == 16){
        session.setAttribute("b16", "disabled");
        i++;
        }else if(questionNumber == 17){
        session.setAttribute("b17", "disabled");
        i++;
        }else if(questionNumber == 18){
        session.setAttribute("b18", "disabled");
        i++;
        }else if(questionNumber == 19){
        session.setAttribute("b19", "disabled");
        i++;
        }else if(questionNumber == 20){
        session.setAttribute("b20", "disabled");
        i++;
        }else if(questionNumber == 21){
        session.setAttribute("b21", "disabled");
        i++;
        }else if(questionNumber == 22){
        session.setAttribute("b22", "disabled");
        i++;
        }else if(questionNumber == 23){
        session.setAttribute("b23", "disabled");
        i++;
        }else if(questionNumber == 24){
        session.setAttribute("b24", "disabled");
        i++;
        }
        session.setAttribute("questionComp", i);
        
        RequestDispatcher view = request.getRequestDispatcher("QNA.jsp");
        view.forward(request, response);
}
}
