/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

import java.io.Serializable;

/**
 *
 * @author marti
 */
public class Partnership extends Business implements Serializable{

    //declare variables
    private String owner1;
    private String owner2;

    //overloaded constructor
    public Partnership(String owner1, String owner2, String businessType, String businessName, String industry, int numOfStaff, String shortTermGoals, String longTermGoals) {
        super(businessType, businessName, industry, numOfStaff, shortTermGoals, longTermGoals);
        this.owner1 = owner1;
        this.owner2 = owner2;
    }

    public String getOwner1() {
        return owner1;
    }

    public void setOwner1(String owner1) {
        this.owner1 = owner1;
    }

    public String getOwner2() {
        return owner2;
    }

    public void setOwner2(String owner2) {
        this.owner2 = owner2;
    }
    //had to use abstract class for business template so i could use getdetails method for each seperate business type other wise i was not able to get individual variables for example owner. ceo etc

    @Override
    public String getDetails() {
        return "Owner 1: " + owner1
                + "\nOwner 2: " + owner2;
    }

}
