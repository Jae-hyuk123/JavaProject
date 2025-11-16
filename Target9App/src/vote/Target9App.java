/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vote;

import login.LoginUI;

/**
 *
 * @author moise
 */
public class Target9App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginUI myLogin = new LoginUI();
        myLogin.setVisible(true);
        VoteGUI myGUI=new VoteGUI();
        myGUI.setVisible(true);
    }
    
}
