/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vote;

/**
 *
 * @author moise
 */
public class Vote {

    //variables
    private String voterNames;
    private String voterId;
    private String vote;
    private String reason;

    //defualt constructor
//   protected Vote() {
//        timeline = " ";
//        county = " ";
//        population = 0;
//        totalVotes = 0;
//        yesVotes = 0;
//        noVotes = 0;
//        spoiledVotes = 0;
//        voterNames = " ";
//        voterId = " ";
//        vote = " ";
//        reason = " ";
//    }

//    //overloaded contructor
//    public Vote(String timeline, String county, int population, int totalVotes, int yesVotes, int noVotes, int spoiledVotes, String voterNames, String voterId, String vote, String reason, String firstName, String lastName, String eMail, String id, String password, String sex, String phoneNum, String address, int age) {
//        super(firstName, lastName, eMail, id, password, sex, phoneNum, address, age);
//        this.totalVotes = totalVotes;
//        this.yesVotes = yesVotes;
//        this.noVotes = noVotes;
//        this.spoiledVotes = spoiledVotes;
//        this.voterNames = voterNames;
//        this.voterId = voterId;
//        this.vote = vote;
//        this.reason = reason;
//    }

    public Vote(String voterNames, String voterId, String vote, String reason) {
        this.voterNames = voterNames;
        this.voterId = voterId;
        this.vote = vote;
        this.reason = reason;
    }
    //setters

    public void setVoterNames(String voterNames) {
        this.voterNames = voterNames;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

   
    //getters

    public String getVoterNames() {
        return voterNames;
    }

    public String getVoterId() {
        return voterId;
    }

    public String getVote() {
        return vote;
    }

    public String getReason() {
        return reason;
    }
    //Details of vote to be overritten in InfrastructureVote and BusinessAidVote class
    public String voteDetails(){
        return "\nvoter Names: "+voterNames+"\nId : "+voterId+"\nVote: "+vote+"\n Reason: " + reason;
    }
}
