/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossword_rupinder_singh;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Rupinder
 */
public class CrossWordController implements Initializable {

    public void start(Stage primaryStage) {

        //create label array and store them in the grid pane
        Label[][] grid = new Label[13][13];
        GridPane gg = new GridPane();

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                grid[i][j] = new Label();
                //grid[i][j].setText(" ");
                gg.add(grid[i][j], j, i);
            }
        }
        grid[0][0].setText("1");
        grid[0][1].setText("2");
        grid[0][2].setText("3");
        grid[0][3].setText("4");
        grid[0][4].setStyle("-fx-background-color: black;");
        grid[0][5].setText("5");
        grid[0][6].setText("6");
        grid[0][7].setText("7");
        grid[0][8].setText("8");
        grid[0][9].setStyle("-fx-background-color: black;");
        grid[0][10].setText("9");
        grid[0][11].setText("10");
        grid[0][12].setText("11");
        grid[1][0].setText("12");
        grid[1][1].setText(" ");
        grid[1][2].setText(" ");
        grid[1][3].setText(" ");
        grid[1][4].setStyle("-fx-background-color: black;");
        grid[1][5].setText("13");
        grid[1][6].setText(" ");
        grid[1][7].setText(" ");
        grid[1][8].setText(" ");
        grid[1][9].setStyle("-fx-background-color: black;");
        grid[1][10].setText("14");
        grid[1][11].setText(" ");
        grid[1][12].setText(" ");
        grid[2][0].setText("15");
        grid[2][1].setText(" ");
        grid[2][2].setText(" ");
        grid[2][3].setText(" ");
        grid[2][4].setStyle("-fx-background-color: black;");
        grid[2][5].setText("16");
        grid[2][6].setText(" ");
        grid[2][7].setText(" ");
        grid[2][8].setText(" ");
        grid[2][9].setText("17");
        grid[2][10].setText(" ");
        grid[2][11].setText(" ");
        grid[2][12].setText(" ");
        grid[3][0].setStyle("-fx-background-color: black;");
        grid[3][1].setStyle("-fx-background-color: black;");
        grid[3][2].setText("18");
        grid[3][3].setText(" ");
        grid[3][4].setText("19");
        grid[3][5].setText(" ");
        grid[3][6].setText(" ");
        grid[3][7].setStyle("-fx-background-color: black;");
        grid[3][8].setStyle("-fx-background-color: black;");
        grid[3][9].setText("20");
        grid[3][10].setText(" ");
        grid[3][11].setText(" ");
        grid[3][12].setText(" ");
        grid[4][0].setText("21");
        grid[4][1].setText("22");
        grid[4][2].setText(" ");
        grid[4][3].setStyle("-fx-background-color: black;");
        grid[4][4].setText("23");
        grid[4][5].setText(" ");
        grid[4][6].setText(" ");
        grid[4][7].setText("24");
        grid[4][8].setText("25");
        grid[4][9].setText(" ");
        grid[4][10].setStyle("-fx-background-color: black;");
        grid[4][11].setStyle("-fx-background-color: black;");
        grid[4][12].setStyle("-fx-background-color: black;");
        grid[5][0].setText("26");
        grid[5][1].setText(" ");
        grid[5][2].setText(" ");
        grid[5][3].setText("27");
        grid[5][4].setText(" ");
        grid[5][5].setStyle("-fx-background-color: black;");
        grid[5][6].setText("28");
        grid[5][7].setText(" ");
        grid[5][8].setText(" ");
        grid[5][9].setText(" ");
        grid[5][10].setText("29");
        grid[5][11].setText("30");
        grid[5][12].setText("31");
        grid[6][0].setText("32");
        grid[6][1].setText(" ");
        grid[6][2].setText(" ");
        grid[6][3].setText(" ");
        grid[6][4].setText(" ");
        grid[6][5].setText("33");
        grid[6][6].setStyle("-fx-background-color: black;");
        grid[6][7].setText("34");
        grid[6][8].setText(" ");
        grid[6][9].setText(" ");
        grid[6][10].setText(" ");
        grid[6][11].setText(" ");
        grid[6][12].setText(" ");
        grid[7][0].setText("35");
        grid[7][1].setText(" ");
        grid[7][2].setText(" ");
        grid[7][3].setText(" ");
        grid[7][4].setText(" ");
        grid[7][5].setText(" ");
        grid[7][6].setText("36");
        grid[7][7].setStyle("-fx-background-color: black;");
        grid[7][8].setText("37");
        grid[7][9].setText(" ");
        grid[7][10].setText(" ");
        grid[7][11].setText(" ");
        grid[7][12].setText(" ");
        grid[8][0].setStyle("-fx-background-color: black;");
        grid[8][1].setStyle("-fx-background-color: black;");
        grid[8][2].setStyle("-fx-background-color: black;");
        grid[8][3].setText("38");
        grid[8][4].setText(" ");
        grid[8][5].setText(" ");
        grid[8][6].setText(" ");
        grid[8][7].setText("39");
        grid[8][8].setText(" ");
        grid[8][9].setStyle("-fx-background-color: black;");
        grid[8][10].setText("40");
        grid[8][11].setText(" ");
        grid[8][12].setText(" ");
        grid[9][0].setText("41");
        grid[9][1].setText("42");
        grid[9][2].setText("43");
        grid[9][3].setText(" ");
        grid[9][4].setStyle("-fx-background-color: black;");
        grid[9][5].setStyle("-fx-background-color: black;");
        grid[9][6].setText("44");
        grid[9][7].setText(" ");
        grid[9][8].setText(" ");
        grid[9][9].setText("45");
        grid[9][10].setText(" ");
        grid[9][11].setStyle("-fx-background-color: black;");
        grid[9][12].setStyle("-fx-background-color: black;");
        grid[10][0].setText("46");
        grid[10][1].setText(" ");
        grid[10][2].setText(" ");
        grid[10][3].setText(" ");
        grid[10][4].setText("47");
        grid[10][5].setText("48");
        grid[10][6].setText(" ");
        grid[10][7].setText(" ");
        grid[10][8].setStyle("-fx-background-color: black;");
        grid[10][9].setText("49");
        grid[10][10].setText(" ");
        grid[10][11].setText("50");
        grid[10][12].setText("51");
        grid[11][0].setText("52");
        grid[11][1].setText(" ");
        grid[11][2].setText(" ");
        grid[11][3].setStyle("-fx-background-color: black;");
        grid[11][4].setText("53");
        grid[11][5].setText(" ");
        grid[11][6].setText(" ");
        grid[11][7].setText(" ");
        grid[11][8].setStyle("-fx-background-color: black;");
        grid[11][9].setText("54");
        grid[11][10].setText(" ");
        grid[11][11].setText(" ");
        grid[11][12].setText(" ");
        grid[11][0].setText("55");
        grid[12][1].setText(" ");
        grid[12][2].setText(" ");
        grid[12][3].setStyle("-fx-background-color: black;");
        grid[12][4].setText("56");
        grid[12][5].setText(" ");
        grid[12][6].setText(" ");
        grid[12][7].setText(" ");
        grid[12][8].setStyle("-fx-background-color: black;");
        grid[12][9].setText("57");
        grid[12][10].setText(" ");
        grid[12][11].setText(" ");
        grid[12][12].setText(" ");

        //stoing the grid pane in the borderpane
        //creating 2 label to dispaly username and score
        BorderPane bp = new BorderPane();
        VBox top = new VBox(20);

        //Label for displaying name.
        Label name = new Label();
        name.setText("Rupinder Singh");

        //Label for displaying score.
        Label score = new Label();
        score.setText("Score: 100");

        //adding label to the vbox.
        top.getChildren().addAll(name, score);

        VBox bottom = new VBox(20);

        Button solve = new Button("Solve Quiz");

        Label time = new Label();

        Timeline timeline = new Timeline(new KeyFrame(
                Duration.millis(1000),
                ae -> time(time)));
        timeline.setCycleCount(601);
        timeline.play();

        Button submit = new Button("Submit");
        bottom.getChildren().addAll(solve, submit, time);

        //Splitpane for the questions to display both sides
        SplitPane splitpane = new SplitPane();
        splitpane.setOrientation(Orientation.HORIZONTAL);
        splitpane.setMinWidth(425.0);

        GridPane across2 = new GridPane();
        ScrollPane across = new ScrollPane(across2);

        Label[] questionsArray = new Label[30];
        String[] questionsArr = new String[30];
        TextField[] answer = new TextField[30];
        Button[] hint = new Button[30];

        questionsArr[0] = "1: Royal Address";
        questionsArr[1] = "5: Cooking Vessel";
        questionsArr[2] = "9: Amtrak depot";
        questionsArr[3] = "12: Fram machine";
        questionsArr[4] = "13: Psychic's phrase";
        questionsArr[5] = "14: Took the gold";
        questionsArr[6] = "15: Burn Blam";
        questionsArr[7] = "16: Voting process";
        questionsArr[8] = "18: Tiny amount";
        questionsArr[9] = "20: Eye amorously";
        questionsArr[10] = "21: Spiders handiwork";
        questionsArr[11] = "23: ogled";
        questionsArr[12] = "26: Flawless";
        questionsArr[13] = "28:Umbrella";
        questionsArr[14] = "32: Kitchen gadget";
        questionsArr[15] = "34: Skin design";
        questionsArr[16] = "35: Infuriated";
        questionsArr[17] = "37: Leaks slowly";
        questionsArr[18] = "38: Placid";
        questionsArr[19] = "40: pack animal";
        questionsArr[20] = "41: submerged";
        questionsArr[21] = "44: cindy crawford eg.";
        questionsArr[22] = "46: most immaculate";
        questionsArr[23] = "49: Dryer outlet";
        questionsArr[24] = "52: ______ moments noticed";
        questionsArr[25] = "53: on an ocean trip";
        questionsArr[26] = "54: Greek god of love";
        questionsArr[27] = "55: Toddler";
        questionsArr[28] = "56: shout";
        questionsArr[29] = "57: Invitation abbr.";
        
        Image image = new Image("hint.png");
        ImageView[] imagee = new ImageView[30];
        for(int i=0;i<30;i++){
        imagee[i] = new ImageView(image);
        
        imagee[i].setFitHeight(25);
        imagee[i].setFitWidth(25);
        }
        for (int i = 0; i < questionsArray.length; i++) {
            questionsArray[i] = new Label();
            hint[i] = new Button();
            hint[i].setGraphic(imagee[i]);
            questionsArray[i].setText(questionsArr[i]);
            answer[i] = new TextField();
            
        }
        Label acrossHeading = new Label("Across");
        across2.add(acrossHeading, 0, 0);
        
        int count=1;
        for (int i = 0; i < 30; i++) {
            across2.add(questionsArray[i], 0, (i + count));
            across2.add(hint[i],1,(i+count++));
            across2.add(answer[i],0,(i+count));
        }
        /*for(int j=0;j<30;j++){
            across2.add(answer[j],0,(j+2));
        }*/

        splitpane.getItems().add(across);

        GridPane down2 = new GridPane();
        ScrollPane down = new ScrollPane(down2);

        Label[] questionsArray2 = new Label[32];
        String[] questionsArr2 = new String[32];
        TextField[] answer2 = new TextField[32];
        Button[] hint2 = new Button[32];

        questionsArr2[0] = "1: Health resort";
        questionsArr2[1] = "2: unhealthy";
        questionsArr2[2] = "3: Ale-like soft drink";
        questionsArr2[3] = "4: Water pitcher";
        questionsArr2[4] = "5: part";
        questionsArr2[5] = "6: In dreamland";
        questionsArr2[6] = "7: Born as";
        questionsArr2[7] = "8: Time unit(abbr.)";
        questionsArr2[8] = "9: gulp";
        questionsArr2[9] = "10: Hammer or screwdriver";
        questionsArr2[10] = "11: Novalist  ____  Rice";
        questionsArr2[11] = "17: until now";
        questionsArr2[12] = "19: Assert";
        questionsArr2[13] = "21: Use a paper towel";
        questionsArr2[14] = "22: first garden";
        questionsArr2[15] = "24: Rodent";
        questionsArr2[16] = "25: Wiped clean";
        questionsArr2[17] = "27: Juneau's state";
        questionsArr2[18] = "29: Thieves";
        questionsArr2[19] = "30: Klutz's cry";
        questionsArr2[20] = "31: Profit and _____";
        questionsArr2[21] = "33: vermilian";
        questionsArr2[22] = "36: _____ is distress";
        questionsArr2[23] = "34: whole";
        questionsArr2[24] = "41: Begone!";
        questionsArr2[25] = "42: Female singer";
        questionsArr2[26] = "43: Tidy";
        questionsArr2[27] = "45: Continually";
        questionsArr2[28] = "47: Aye's opposite";
        questionsArr2[29] = "48: Opposite of WNW";
        questionsArr2[30] = "50: It follows Oct.";
        questionsArr2[31] = "51: Recipe unit (abbr.)";

        
        Image image2 = new Image("hint.png");
        ImageView[] imagee2 = new ImageView[32];
        for(int i=0;i<32;i++){
        imagee2[i] = new ImageView(image2);
        
        imagee2[i].setFitHeight(25);
        imagee2[i].setFitWidth(25);
        }
        
        for (int i = 0; i < questionsArray2.length; i++) {
            questionsArray2[i] = new Label();
            hint2[i] = new Button();
            hint2[i].setGraphic(imagee2[i]);
            questionsArray2[i].setText(questionsArr2[i]);
            answer2[i] = new TextField();

        }
        Label downHeading = new Label("Down");
        down2.add(downHeading, 0, 0);
        int count2=1;
        for (int i = 0; i < 32; i++) {
            down2.add(questionsArray2[i], 0, (i + count2));
            down2.add(hint2[i],1,(i+count2++));
            down2.add(answer2[i],0,(i+count2));
        }

        splitpane.getItems().add(down);

        //adding both label to border pane.
        bp.setCenter(gg);
        bp.setTop(top);
        bp.setBottom(bottom);
        bp.setRight(splitpane);

        solve.setOnAction(e -> {
            grid[0][0].setText("S");
            grid[0][1].setText("I");
            grid[0][2].setText("R");
            grid[0][3].setText("E");
            grid[0][4].setStyle("-fx-background-color: black;");
            grid[0][5].setText("P");
            grid[0][6].setText("A");
            grid[0][7].setText("N");
            grid[0][8].setText("S");
            grid[0][9].setStyle("-fx-background-color: black;");
            grid[0][10].setText("S");
            grid[0][11].setText("T");
            grid[0][12].setText("A");
            grid[1][0].setText("P");
            grid[1][1].setText("L");
            grid[1][2].setText("O");
            grid[1][3].setText("W");
            grid[1][4].setStyle("-fx-background-color: black;");
            grid[1][5].setText("I");
            grid[1][6].setText("S");
            grid[1][7].setText("E");
            grid[1][8].setText("E");
            grid[1][9].setStyle("-fx-background-color: black;");
            grid[1][10].setText("W");
            grid[1][11].setText("O");
            grid[1][12].setText("N");
            grid[2][0].setText("A");
            grid[2][1].setText("L");
            grid[2][2].setText("O");
            grid[2][3].setText("E");
            grid[2][4].setStyle("-fx-background-color: black;");
            grid[2][5].setText("E");
            grid[2][6].setText("L");
            grid[2][7].setText("E");
            grid[2][8].setText("C");
            grid[2][9].setText("T");
            grid[2][10].setText("I");
            grid[2][11].setText("O");
            grid[2][12].setText("N");
            grid[3][0].setStyle("-fx-background-color: black;");
            grid[3][1].setStyle("-fx-background-color: black;");
            grid[3][2].setText("18T");
            grid[3][3].setText("R");
            grid[3][4].setText("19A");
            grid[3][5].setText("C");
            grid[3][6].setText("E");
            grid[3][7].setStyle("-fx-background-color: black;");
            grid[3][8].setStyle("-fx-background-color: black;");
            grid[3][9].setText("20O");
            grid[3][10].setText("G");
            grid[3][11].setText("L");
            grid[3][12].setText("E");
            grid[4][0].setText("21W");
            grid[4][1].setText("22E");
            grid[4][2].setText("B");
            grid[4][3].setStyle("-fx-background-color: black;");
            grid[4][4].setText("23L");
            grid[4][5].setText("E");
            grid[4][6].setText("E");
            grid[4][7].setText("24R");
            grid[4][8].setText("25E");
            grid[4][9].setText("D");
            grid[4][10].setStyle("-fx-background-color: black;");
            grid[4][11].setStyle("-fx-background-color: black;");
            grid[4][12].setStyle("-fx-background-color: black;");
            grid[5][0].setText("26I");
            grid[5][1].setText("D");
            grid[5][2].setText("E");
            grid[5][3].setText("27A");
            grid[5][4].setText("L");
            grid[5][5].setStyle("-fx-background-color: black;");
            grid[5][6].setText("28P");
            grid[5][7].setText("A");
            grid[5][8].setText("R");
            grid[5][9].setText("A");
            grid[5][10].setText("29S");
            grid[5][11].setText("30O");
            grid[5][12].setText("31L");
            grid[6][0].setText("32P");
            grid[6][1].setText("E");
            grid[6][2].setText("E");
            grid[6][3].setText("L");
            grid[6][4].setText("E");
            grid[6][5].setText("33R");
            grid[6][6].setStyle("-fx-background-color: black;");
            grid[6][7].setText("34T");
            grid[6][8].setText("A");
            grid[6][9].setText("T");
            grid[6][10].setText("T");
            grid[6][11].setText("O");
            grid[6][12].setText("O");
            grid[7][0].setText("35E");
            grid[7][1].setText("N");
            grid[7][2].setText("R");
            grid[7][3].setText("A");
            grid[7][4].setText("G");
            grid[7][5].setText("E");
            grid[7][6].setText("36D");
            grid[7][7].setStyle("-fx-background-color: black;");
            grid[7][8].setText("37S");
            grid[7][9].setText("E");
            grid[7][10].setText("E");
            grid[7][11].setText("P");
            grid[7][12].setText("S");
            grid[8][0].setStyle("-fx-background-color: black;");
            grid[8][1].setStyle("-fx-background-color: black;");
            grid[8][2].setStyle("-fx-background-color: black;");
            grid[8][3].setText("38S");
            grid[8][4].setText("E");
            grid[8][5].setText("D");
            grid[8][6].setText("A");
            grid[8][7].setText("39T");
            grid[8][8].setText("E");
            grid[8][9].setStyle("-fx-background-color: black;");
            grid[8][10].setText("40A");
            grid[8][11].setText("S");
            grid[8][12].setText("S");
            grid[9][0].setText("41S");
            grid[9][1].setText("42A");
            grid[9][2].setText("43N");
            grid[9][3].setText("K");
            grid[9][4].setStyle("-fx-background-color: black;");
            grid[9][5].setStyle("-fx-background-color: black;");
            grid[9][6].setText("44M");
            grid[9][7].setText("O");
            grid[9][8].setText("D");
            grid[9][9].setText("45E");
            grid[9][10].setText("L");
            grid[9][11].setStyle("-fx-background-color: black;");
            grid[9][12].setStyle("-fx-background-color: black;");
            grid[10][0].setText("46C");
            grid[10][1].setText("L");
            grid[10][2].setText("E");
            grid[10][3].setText("A");
            grid[10][4].setText("4N7");
            grid[10][5].setText("48E");
            grid[10][6].setText("S");
            grid[10][7].setText("T");
            grid[10][8].setStyle("-fx-background-color: black;");
            grid[10][9].setText("49V");
            grid[10][10].setText("E");
            grid[10][11].setText("50N");
            grid[10][12].setText("51T");
            grid[11][0].setText("52A");
            grid[11][1].setText("T");
            grid[11][2].setText("A");
            grid[11][3].setStyle("-fx-background-color: black;");
            grid[11][4].setText("53A");
            grid[11][5].setText("S");
            grid[11][6].setText("E");
            grid[11][7].setText("A");
            grid[11][8].setStyle("-fx-background-color: black;");
            grid[11][9].setText("54E");
            grid[11][10].setText("R");
            grid[11][11].setText("O");
            grid[11][12].setText("S");
            grid[11][0].setText("55T");
            grid[12][1].setText("O");
            grid[12][2].setText("T");
            grid[12][3].setStyle("-fx-background-color: black;");
            grid[12][4].setText("56Y");
            grid[12][5].setText("E");
            grid[12][6].setText("L");
            grid[12][7].setText("L");
            grid[12][8].setStyle("-fx-background-color: black;");
            grid[12][9].setText("57R");
            grid[12][10].setText("S");
            grid[12][11].setText("V");
            grid[12][12].setText("P");
        });

        
        Scene scene = new Scene(bp, 750, 600);
        //Style sheet 
        String css = Crossword_Rupinder_singh.class.getResource("crossword.css").toExternalForm();
        scene.getStylesheets().add(css);
       

        //style for grid.
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                grid[i][j].getStyleClass().add("label2");
            }
        }
        
        
         
        // style for labels.

        name.getStyleClass().add("label1");
        score.getStyleClass().add("label1");
        solve.getStyleClass().add("but1");
        submit.getStyleClass().add("but1");
        acrossHeading.getStyleClass().add("acrossLabel");
        downHeading.getStyleClass().add("downLabel");
        
        
        
    }
    private int counter = 0;

    public void time(Label time) {
        time.setText("Time: " + counter++ + " sec");
    }
    
@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void window3() {
        Crossword_Rupinder_singh.showStage3();
    }
}

