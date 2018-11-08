package QuestionController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import LoginBean.ArrayClass;
import LoginBean.Question;
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
public class game extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //String c1 = request.getParameter("param1");
        HttpSession session = request.getSession();

//        session.setAttribute("name", c1);
//        String n1 = (String) session.getAttribute("name");
//        
        String answer = request.getParameter("answer");
        //the question selected from the question grid

        int questionNumber = (Integer) session.getAttribute("selection");
        ArrayClass question = new ArrayClass();

        question.loadQuestion();
        //retrieving the question from the array.

        Question correctquestion = question.questions[questionNumber];
        //correct answer from the array.

        login score = (login)session.getAttribute("player");

        String CAnswer = correctquestion.getCorrectAnswer();
        String CAnswer1 = correctquestion.getAnswer1();
        String CAnswer2 = correctquestion.getAnswer2();
        String CAnswer3 = correctquestion.getAnswer3();
        String CAnswer4 = correctquestion.getAnswer4();
        int value = correctquestion.getValue();
        
        int i = (Integer)session.getAttribute("questionComp");
        
        if(request.getParameter("button").equalsIgnoreCase("Submit")){
        if (answer.equalsIgnoreCase(CAnswer)) {
                int s = score.getScore();
                s += value;
                score.setScore(s);
                session.setAttribute("Score", score);
                if(i==25){
                RequestDispatcher view = request.getRequestDispatcher("FinishPage.jsp");
            view.forward(request, response);
                }else{
                    RequestDispatcher view = request.getRequestDispatcher("questionGrid.jsp");
            view.forward(request, response);
                }
        }else {
            int s = score.getScore();
                s -= value;
                score.setScore(s);
                session.setAttribute("Score", score);
                if(i==25){
                RequestDispatcher view = request.getRequestDispatcher("FinishPage.jsp");
            view.forward(request, response);
                }else{
                    RequestDispatcher view = request.getRequestDispatcher("questionGrid.jsp");
            view.forward(request, response);
                }
        }
        }else if(i==25 && request.getParameter("button").equalsIgnoreCase("skip")||request.getParameter("button").equalsIgnoreCase("submit")){
            RequestDispatcher view = request.getRequestDispatcher("FinishPage.jsp");
            view.forward(request, response);
            
        }else if(request.getParameter("button").equalsIgnoreCase("skip")){
            RequestDispatcher view = request.getRequestDispatcher("questionGrid.jsp");
            view.forward(request, response);
        }
    }
}
