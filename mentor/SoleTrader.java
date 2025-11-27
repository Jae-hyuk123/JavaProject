/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author marti
 */
public class SoleTrader extends Business {
    //declare variables
    protected String owner;
    
    //overloaded constructor
    public SoleTrader(String owner, String businessType, String businessName, String industry, int numOfStaff, String shortTermGoals, String longTermGoals){
        super(businessType, businessName, industry, numOfStaff, shortTermGoals, longTermGoals);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    //had to use abstract class for business template so i could use getdetails method for each seperate business type other wise i was not able to get individual variables for example owner. ceo etc
    
    @Override
    public String getDetails(){
        return "Owner: " + owner;  
    }
    
    
}
