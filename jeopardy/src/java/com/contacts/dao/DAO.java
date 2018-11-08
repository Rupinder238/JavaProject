/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contacts.dao;

import LoginBean.Question;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rupinder
 */
public class DAO {

    public Question getConatct(String cat, int value) {
        Question c = new Question();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String QUERY = "select * from jeopardy where category='" + cat + "' and value=" + value + ";" ;
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/exercise", "root", "IAMkiler238");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(QUERY);
                System.out.println(QUERY);
        while (rs.next()) {

            

            c.setCategory(rs.getString(1));

            c.setValue(rs.getInt(2));

            c.setQuestion(rs.getString(3));

            c.setAnswer1(rs.getString(4));
            c.setAnswer2(rs.getString(5));
            c.setAnswer3(rs.getString(6));
            c.setAnswer4(rs.getString(7));
            c.setCorrectAnswer(rs.getString(8));

        }
            
        } catch (Exception e) {

            System.out.println("Connection Failed");
            
            e.printStackTrace();

        }
            System.out.println(c.getCategory());
            return c;
    }
}
