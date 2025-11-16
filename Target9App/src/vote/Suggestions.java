/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vote;

/**
 *
 * @author moise
 */
public class Suggestions extends Vote  {
    //variables
    private String  userSuggestions;
    
    //overloaded constructor

    public Suggestions(String userSuggestions, String voterNames, String voterId, String vote, String reason) {
        super(voterNames, voterId, vote, reason);
        this.userSuggestions = userSuggestions;
    }

    
    //setters
    public void setUserSuggestions(String userSuggestions) {
        this.userSuggestions = userSuggestions;
    }
    
    //getters
    public String getUserSuggestions() {
        return userSuggestions;
    }
      @Override
    public String voteDetails(){
        return super.voteDetails()+userSuggestions;
    }
    
    
}
