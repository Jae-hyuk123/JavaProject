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
    private String suggestions;
    private String[] userSuggestions;
    
    //overloaded constructor

    public Suggestions(String suggestions, String[] userSuggestions, String timeline, String county, int population, int totalVotes, int yesVotes, int noVotes, int spoiledVotes, String voterNames, String voterId, String vote, String reason, String firstName, String lastName, String eMail, String id, String password, String sex, String phoneNum, String address, int age) {
        super(timeline, county, population, totalVotes, yesVotes, noVotes, spoiledVotes, voterNames, voterId, vote, reason, firstName, lastName, eMail, id, password, sex, phoneNum, address, age);
        this.suggestions = suggestions;
        this.userSuggestions = userSuggestions;
    }
    
    
    //setters

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    public void setUserSuggestions(String[] userSuggestions) {
        this.userSuggestions = userSuggestions;
    }
    
    //getters

    public String getSuggestions() {
        return suggestions;
    }

    public String[] getUserSuggestions() {
        return userSuggestions;
    }
    
    
    
}
