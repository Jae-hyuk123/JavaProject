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
    public SoleTrader(String owner, String businessName, String industry, int numOfStaff){
        super(businessName, industry, numOfStaff);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
}
