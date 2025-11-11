/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vote;

/**
 *
 * @author moise
 */
public class Vote extends Details {

    //variables
    private String timeline, county;
    private int population, totalVotes, yesVotes, noVotes, spoiledVotes;
    private String voterNames;
    private String voterId;
    private String vote;
    private String reason;

    //overloaded contructor

    public Vote(String timeline, String county, int population, int totalVotes, int yesVotes, int noVotes, int spoiledVotes, String voterNames, String voterId, String vote, String reason, String firstName, String lastName, String eMail, String id, String password, String sex, String phoneNum, String address, int age) {
        super(firstName, lastName, eMail, id, password, sex, phoneNum, address, age);
        this.timeline = timeline;
        this.county = county;
        this.population = population;
        this.totalVotes = totalVotes;
        this.yesVotes = yesVotes;
        this.noVotes = noVotes;
        this.spoiledVotes = spoiledVotes;
        this.voterNames = voterNames;
        this.voterId = voterId;
        this.vote = vote;
        this.reason = reason;
    }
    

    //setters
    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public void setYesVotes(int yesVotes) {
        this.yesVotes = yesVotes;
    }

    public void setNoVotes(int noVotes) {
        this.noVotes = noVotes;
    }

    public void setSpoiledVotes(int spoiledVotes) {
        this.spoiledVotes = spoiledVotes;
    }

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


    //calculate total votes, yes votes and no votes
    /*public void compute() {
        for (int i = 0; i < vote.length; i++) {
            if (vote[i].equalsIgnoreCase("Yes")) {
                yesVotes += 1;
                totalVotes += 1;
            } else if (vote[i].equalsIgnoreCase("False")) {
                noVotes += 1;
                totalVotes += 1;
            } else if (vote[i].equalsIgnoreCase(" ")) {
                spoiledVotes += 1;
                totalVotes += 1;
            } else {
                System.out.print("Invalid vote");
            }

        }
    }*/

    //getters
    public String getTimeline() {
        return timeline;
    }

    public String getCounty() {
        return county;
    }

    public int getPopulation() {
        return population;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

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

    
    public int getYesVotes() {
        return yesVotes;
    }

    public int getNoVotes() {
        return noVotes;
    }

    public int getSpoiledVotes() {
        return spoiledVotes;
    }
    
    @Override
    public String printDetails() {
        //Using String Buffer to get all voters details to then add it to print details
        return "Organiser: \n" + super.printDetails() +"\n Reason: "+reason+ "\nTimeline: " + timeline + "\nCounty: " + county + "\nPopulation: "
                + population + "\nTotal Votes: " +totalVotes+ "\nYes Votes: " + yesVotes + "\nNo Votes:" + noVotes;
    }  

}
