/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author marti
 */
public class LLC extends Business {

    //declare variables
    private String ceo;
    private int numOfBoardMembers;

    //overloaded constructor
    public LLC(String ceo, String businessType, String businessName, String industry, int numOfStaff, String shortTermGoals, String longTermGoals, int numOfBoardMembers) {
        super(businessType, businessName, industry, numOfStaff, shortTermGoals, longTermGoals);
        this.ceo = ceo;
        this.numOfBoardMembers = numOfBoardMembers;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getNumOfBoardMembers() {
        return numOfBoardMembers;
    }

    public void setNumOfBoardMembers(int numOfBoardMembers) {
        this.numOfBoardMembers = numOfBoardMembers;
    }
    //had to use abstract class for business template so i could use getdetails method for each seperate business type other wise i was not able to get individual variables for example owner. ceo etc

    @Override
    public String getDetails() {
        return "CEO : " + ceo
                + "\nNumber of board members: " + numOfBoardMembers;
    }

    //might add will come back to it later
    /*@Override
    public double revenue(){
        return revenue;
    }*/
}
