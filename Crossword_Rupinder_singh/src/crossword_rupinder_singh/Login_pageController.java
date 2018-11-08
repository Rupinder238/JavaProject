/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword_rupinder_singh;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rupinder
 */
public class Login_pageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    public static String player;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    
    public void window2(){
        
        Crossword_Rupinder_singh.showStage2();
    }
    
    @FXML 
    private Label heading;
    
    @FXML
    private Label name;
    
    @FXML
    private TextField playername;
    
    @FXML
    private Button login;
    
    @FXML
    public void load(){
        player = playername.getText();
        
        
    }
    
}