/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vote;

/**
 *
 * @author moise
 */
public class Organiser extends Details  implements TurnoutPercentage,YesPercentage,NoPercentage,SpoiledPercentage {
    //variables

    private String timeline, county;
    private int population,totalVotes, yesVotes, noVotes, spoiledVotes;
    
    //default constructor 

//    public Organiser(){
//        timeline="";
//        county="";
//        population=0;
//    }

    //overloaded constructor
    public Organiser(String timeline, String county, int population, int totalVotes, int yesVotes, int noVotes, int spoiledVotes, String firstName, String lastName, String eMail, String id, String password, String sex, String phoneNum, String address, int age) {
        super(firstName, lastName, eMail, id, password, sex, phoneNum, address, age);
        this.timeline = timeline;
        this.county = county;
        this.population = population;
        this.totalVotes = totalVotes;
        this.yesVotes = yesVotes;
        this.noVotes = noVotes;
        this.spoiledVotes = spoiledVotes;
    }


    
    //setters
    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    //getters
    public String getTimeline() {
        return timeline;
    }

    public String getCounty() {
        return county;
    }
    
    //Details for the organiser of the vote added to details of the vote
    @Override
    public String printDetails() {
        //Using String Buffer to get all voters details to then add it to print details
        return "Organiser: \n" + super.printDetails() + "\nTimeline: " + timeline + "\nCounty: "+county+"\nPopulation: "+population+
                "\nTotal votes: "+totalVotes+"\nResults : Yes "
                +"No "+" Spoiled "+yesPercentage()+noPercentage()+spoiledPercentage();

    }
    //Calculate turnout percentage
    @Override
    public double turnoutPercentage() {
        return   ((double)(totalVotes/population));
     }
    //Calculate yes votes percentage

    @Override
    public double yesPercentage() {
         return ((double)(yesVotes/totalVotes));
    }
    //Calculate no votes percentage

    @Override
    public double noPercentage() {
        return ((double)(noVotes/totalVotes));
    }
    //Calculate spoiled votes percentage
    @Override
    public double spoiledPercentage(){
        return ((double)(spoiledVotes/totalVotes));
    }
}
