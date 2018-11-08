/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword_rupinder_singh;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Rupinder
 */
public class Crossword_Rupinder_singh extends Application {

    static Stage Login_Page = new Stage();
    static Stage CrossWord = new Stage();
    static Stage Result = new Stage();
    static Stage Scoreboard = new Stage();

    static Login_pageController c1;
    static CrossWordController c2;
    static ResultController c3;
    static ScoreboardController c4;

    @Override
    public void start(Stage stage) throws Exception {
        //Parent root1 = FXMLLoader.load(getClass().getResource("Stage1.fxml"));
        //Parent root2 = FXMLLoader.load(getClass().getResource("Stage2.fxml"));
        //Parent root3 = FXMLLoader.load(getClass().getResource("Stage3.fxml"));

        FXMLLoader r1 = new FXMLLoader(getClass().getResource("Login_page.fxml"));
        FXMLLoader r2 = new FXMLLoader(getClass().getResource("CrossWord.fxml"));
        FXMLLoader r3 = new FXMLLoader(getClass().getResource("Result.fxml"));
        FXMLLoader r4 = new FXMLLoader(getClass().getResource("Scoreboard.fxml"));
        
        Parent root1 = r1.load();
        Parent root2 = r2.load();
        Parent root3 = r3.load();
        Parent root4 = r4.load();
        
        c1 = r1.getController();
        c2 = r2.getController();
        c3 = r3.getController();
        c4 = r4.getController();

        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);
        Scene scene3 = new Scene(root3);
        Scene scene4 = new Scene(root4);

        Login_Page.setScene(scene1);
        CrossWord.setScene(scene2);
        Result.setScene(scene3);
        Scoreboard.setScene(scene4);
        
        showStage1();
      
        

    }

    public static void showStage1() {
        Login_Page.show();
        CrossWord.hide();
        Result.hide();
        Scoreboard.hide();
        
        c1.load();
        
    }

    public static void showStage2() {
        CrossWord.show();
        Login_Page.hide();
        Result.hide();
        Scoreboard.hide();
        

    }

    public static void showStage3() {
        Result.show();
        Login_Page.hide();
        CrossWord.hide();
        Scoreboard.hide();

    }

    public static void showStage4() {
        Scoreboard.show();
        Login_Page.hide();
        CrossWord.hide();
        Result.hide();

    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
