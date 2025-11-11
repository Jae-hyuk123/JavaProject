/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vote;

/**
 *
 * @author moise
 */
public class InfrastructureVote extends Vote  implements TurnoutPercentage,YesPercentage,NoPercentage {
    //variables
    private String infrastructure;
    
    //overloaded constructor

    public InfrastructureVote(String infrastructure, String timeline, String county, int population, int totalVotes, int yesVotes, int noVotes, int spoiledVotes, String voterNames, String voterId, String vote, String reason, String firstName, String lastName, String eMail, String id, String password, String sex, String phoneNum, String address, int age) {
        super(timeline, county, population, totalVotes, yesVotes, noVotes, spoiledVotes, voterNames, voterId, vote, reason, firstName, lastName, eMail, id, password, sex, phoneNum, address, age);
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
    
    @Override
    public String printDetails(){
        return "Vote on Infrastructure Project: "+infrastructure+super.printDetails();
    }
    
    @Override
    public double turnoutPercentage(){
        return ((double)totalVotes/population)*100;
    }
    @Override
    public double yesPercentage(){
        return ((double)yesVotes/totalVotes)*100;
    }
    @Override
    public double noPercentage(){
        return ((double)noVotes/totalVotes)*100;
    }
    
    
}
