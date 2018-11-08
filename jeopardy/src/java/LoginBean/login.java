/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginBean;

/**
 *
 * @author Rupinder
 */
public class login {
    private String name;
    private int Score;

    public login(String name, int Score) {
        this.name = name;
        this.Score = Score;
    }

    public login() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public int getScore() {
        return Score;
    }
    
}
