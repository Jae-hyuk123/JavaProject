/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentor;

/**
 *
 * @author marti
 */
public class Partnership extends Business {
    //declare variables
    private String owner1;
    private String owner2;
    
    
    //overloaded constructor
    public Partnership(String owner1, String owner2, String businessName, String industry, int numOfStaff){
        super(businessName, industry, numOfStaff);
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
    
}
