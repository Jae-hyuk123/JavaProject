/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vote;

/**
 *
 * @author moise
 */
public class InfrastructureVote extends Vote{
    //variables
    private String infrastructure;
   // private int population, totalVotes, yesVotes, noVotes, spoiledVotes;
    //overloaded constructor

    public InfrastructureVote(String infrastructure, String voterNames, String voterId, String vote, String reason) {
        super(voterNames, voterId, vote, reason);
        this.infrastructure = infrastructure;
    }
    //setters

    public void setInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure;
    }
    
    //getters

    public String getInfrastructure() {
        return infrastructure;
    }
    //override voteDetails with infrastructure project name
    @Override
    public String voteDetails(){
        return "Vote on Infrastructure Project: "+infrastructure+super.voteDetails();
    }
    


    
    
    
}
